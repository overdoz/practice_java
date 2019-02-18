public class B extends A {
    public int x = 1;
    public static int y = 17;

    public B(int x) {
        super(x);
        this.x += x;
        this.y = (new A(new Long(x))).y;
    }

    public void f(double x) {
        this.x = (int) x;
        A.x = super.x + 3;
    }
}