public class Kreis {
    private Punkt2D p;
    private double r;

    public Kreis(Punkt2D punkt, double radius) {
        this.p = punkt;
        
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be positive");
        } else {
            this.r = radius;
        }
    }

    public void verschiebe(double x, double y) {
        p.verschiebe(x, y);
    }

    public void skalieren(double fac) {

    }

    public boolean schneidet(Kreis k) {
        double distance = this.p.euklidischeDistanz(k.p);
        return distance < this.r + k.r;
    }

 
}