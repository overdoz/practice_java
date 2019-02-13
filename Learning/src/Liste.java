public class Liste<T> {
    private int size;
    private Entry<T> firstEntry;

    public Liste() {
        this.firstEntry = null;
    }

    public int getSize() {
        return this.size;
    }

    public T removeAt(int index) {
        Entry<T> temp = firstEntry, prev = null;

        if (index == 0) {
            firstEntry = firstEntry.getNext();
        }

        for (int i = 0; i < index + 1; i++) {
            prev = temp;
            temp = temp.getNext();
        }

        if (temp == null) {
            throw new Exception("Halt Stopp");
        }

        prev.setNext(temp.getNext());
        return temp;
    }

    public void pushAt(Entry<T> data) {
        data.setNext(firstEntry);
        firstEntry = data;
    }
}