public class Punkt2D {
    private double x;
    private double y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void verschiebe(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double euklidischeDistanz(Punkt2D p) {
        double dx = p.x - x;
        double dy = p.y - y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    public void skaliere(double fac) {
        this.x *= fac;
        this.y *= fac;
    }
}
