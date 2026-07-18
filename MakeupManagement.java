package makeupmanagement;
class InsufficientProductException extends Exception {
    public InsufficientProductException(String message) {
        super(message);
    }
}

class InvalidRefillException extends Exception {
    public InvalidRefillException(String message) {
        super(message);
    }
}

class MakeupKit {
    private int productQuantity;
    public MakeupKit(int initialQuantity) {
        if (initialQuantity < 0) {
            productQuantity = 0;
        } else {
            productQuantity = initialQuantity;
        }
    }
    public void refillProducts(int quantity)
            throws InvalidRefillException {
        if (quantity <= 0) {
            throw new InvalidRefillException(
                    "Refill quantity must be greater than zero.");
        }
        productQuantity += quantity;
        System.out.println("Successfully added " + quantity + " makeup products.");
    }
    public void useProducts(int quantity)
            throws InsufficientProductException {
        if (quantity > productQuantity) {
            throw new InsufficientProductException(
                    "Not enough makeup products available.");
        }
        productQuantity -= quantity;
        System.out.println("Successfully used " + quantity + " makeup product(s).");
    }
    public void displayQuantity() {
        System.out.println("Available Makeup Products : " + productQuantity);
    }
}

public class MakeupManagement {
public static void main(String[] args) {
        MakeupKit kit = new MakeupKit(15);
        try {
            kit.displayQuantity();
            kit.useProducts(5);
            kit.useProducts(20); 
        }
        catch (InsufficientProductException e) {
            System.out.println("Usage Error : " + e.getMessage());
        }
        try {
            kit.refillProducts(-3); 
        }
        catch (InvalidRefillException e) {
            System.out.println("Refill Error : " + e.getMessage());
        }
        kit.displayQuantity();
    }
}
