public class Seminarraum {

    protected int stuehle;


    public Seminarraum() {
        stuehle = 20;
    }

    public int getStuehle() {
        return stuehle;
    }

    public void setStuehle(int anzahl) {
        if (anzahl <= 20) {
            this.stuehle = anzahl;
        }
    }

    public void addChair() {
        if (stuehle < 20) {
            stuehle++;
        }
    }

    public void takeChair() {
        if (stuehle < 0) {
            stuehle--;
        }
    }

    public String toString() {
        return "Der Raum hat " + stuehle + " Stühle";
    }

    public boolean equals(Seminarraum r) {
        return stuehle == r.stuehle;
    }





}
