public class Fuchs extends Hund {
    public fuchs() {

    }
        public String bellen() {
            return "Ringding";
        }
        
        public String spielen(Fuchs f) {
            return "Ringding " + f.bellen();
        }

        public String spielen(Hund h){
            return "Wuff " + h.bellen();
            } 
}