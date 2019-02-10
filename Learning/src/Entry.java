public class Entry<T> {
    private T element;
    private Entry<T> next;

    public Entry(T o, Entry<T> next) {
        this.element = o;
        this.next = next;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Entry<T> getNext() {
        return this.next;
    }

    public void setNext(Entry<T> next) {
        this.next = next;
    }
}