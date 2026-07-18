package taskperform;
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

class ExceptionDemo{
    public void performtask(int value) throws CustomException{
        if(value < 0)
        {
            throw new CustomException("Value cannot be negative");
        }
        else if (value > 100)
        {
            throw new CustomException("Value cannot exceed 100");
        }
        else
        {
            System.out.println("Task Performed Succesfully");
        }
    }
} 
    
public class TaskPerform {
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try
        {
            demo.performtask(50); 
            demo.performtask(10); 
            demo.performtask(100);
        }
        catch (CustomException e) {
                System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
