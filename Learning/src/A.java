public class A {
    public static long x = 6;
    public static int y = 1;

    public A(int i) {
 
        x += 1;
        System.out.println("A(int)");

    }

    public A(double d) {
        x -= (int) d;
        System.out.println("A(double)");
    }

    public void f(double x) {
        x += 1;
        y = A.y + 1;
    }

    public void f(int x) {
        A.y = x;
    }
}