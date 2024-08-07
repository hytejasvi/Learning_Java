package Methods;

public class varArgsPractice {
    public static void main (String[] args) {
        show();
        show(10,20);
        show(100,200,300);
        show(new int[] {1,2,3});

    }

    private static void show(int ...A) {
        for (int x: A) {
            System.out.println(x);
        }
    }
}
