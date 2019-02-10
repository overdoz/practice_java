public class Liste<T> {
    private int size;
    private Entry<T> firstEntry;

    public Liste() {
        this.firstEntry = null;
    }

    public int getSize() {
        return this.size;
    }
}