package ExceptionHandling.StackOperationImplementation;

public class Stack {
    private int size;
    private int top =-1;
    private int []S;

    public Stack(int sz) {
        size=sz;
        S = new int[sz];
    }
    public void push(int num) throws StackOverFlowException {
        if (top==size-1) {
            throw new StackOverFlowException();
        }
        top++;
        S[top] = num;
    }
    public int pop() throws StackUnderFlowException {
        int x=-1;
        if (top <0) {
            throw new StackUnderFlowException();
        }
        x = S[top];
        top--;
        return x;
    }
    public static void main (String[] args) {
        try {
            Stack sc = new Stack(5);
            sc.push(10);
            sc.push(20);
            sc.push(100);
            sc.push(200);
            sc.push(300);
            sc.push(400);
            System.out.println(sc.pop());
            System.out.println(sc.pop());
            System.out.println(sc.pop());
            System.out.println(sc.pop());
            System.out.println(sc.pop());
            System.out.println(sc.pop());
        } catch (StackOverFlowException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (StackUnderFlowException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside the finally block");
        }
    }
}
