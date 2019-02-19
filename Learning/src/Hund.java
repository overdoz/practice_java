public class Hund {
    public Hund(){
    }
    public String bellen(){
    return "Wuff";
    }
    
    public String spielen(Hund h){
    return "Wuff " + h.bellen();
    } 
}