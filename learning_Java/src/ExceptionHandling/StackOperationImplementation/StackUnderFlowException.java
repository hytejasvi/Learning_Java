package ExceptionHandling.StackOperationImplementation;

public class StackUnderFlowException extends Exception{
    public String toString() {
        return "The stack is Empty";
    }
}
