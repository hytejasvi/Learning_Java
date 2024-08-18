package StaticAndFinal_Practice;

public class StaticBlockPractice {
    static {
        System.out.println("block 1");
    }
    static {
        System.out.println("block 2");
    }

    public static void main (String []args) {
        System.out.println("Main block");
    }
}
