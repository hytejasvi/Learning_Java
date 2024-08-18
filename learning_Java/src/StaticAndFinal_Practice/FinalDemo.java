package StaticAndFinal_Practice;

public class FinalDemo {
    final int x;
    {
        x=10;//variable is initialized inside a instance block
    }
    void Display () {
        System.out.println(x);
    }
    public static void main (String[] args) {
        FinalDemo f1 = new FinalDemo();
        f1.Display();
        FinalDemo f2 = new FinalDemo();

    }
}
