package bank.account.holder;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidDepositException extends Exception {
    public InvalidDepositException (String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    public BankAccount(double initialbalance) {
        if (initialbalance < 0)
        {
            this.balance = 0;
        }
        else 
        {
        this.balance = initialbalance;
        } 
    }
    public void deposit(double amount) throws InvalidDepositException {
        if(amount <= 0)
        {
            throw new InvalidDepositException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Successfully Deposited : " + amount);
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance)
        {
            throw new InsufficientBalanceException("Insufficient Balance for Withdrawal.");
        }
        balance -= amount;
        System.out.println("Successfully WithDrawn : " + amount);
    }
    public void displayBalance(){
        System.out.println("Current Balance : " + balance);
    } 
}

public class BankAccountHolder {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(7000);
        try {
            account.displayBalance();
            account.deposit(2000);
            account.withdraw(10000);
        }
        catch (InvalidDepositException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        }
        try {
            account.deposit(-500); 
        } 
        catch (InvalidDepositException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        }
        account.displayBalance();
    }   
}
