import java.util.ArrayList;

public class Vektor {
    private ArrayList<Integer> coords;

    public Vektor(int anzahl) {
        coords = new ArrayList<>();
        for (int i = 0; i < anzahl; i++) {
            coords.add(0);
        }
    }

    public Vektor(int q, int w, int e, int r) {
        coords = new ArrayList<>();
        coords.add(q);
        coords.add(w);
        coords.add(e);
        coords.add(r);
    }

    
}
