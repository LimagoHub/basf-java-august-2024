package de.basf.collections;

public class Stapel<T> {

    private static final int DEFAULT_SIZE = 10;
    private T []data;
    private int index;
    public Stapel() throws StapelException {
        this(DEFAULT_SIZE);
    }
    public Stapel(int size) throws StapelException {
        try {
            data = (T[]) new Object[size];
            index  = 0;
        } catch (Exception e) {
            throw new StapelException("Falsche Groesse", e);
        }
    }

    public void push(T value) throws StapelException {

        try {
            data[index++] = value;
        } catch (Exception e) {
            throw new StapelException("Overflow",e);
        }
    }

    public T pop() throws StapelException {

        if(isEmpty()) throw new StapelException("Underflow");
        return data[--index];
    }

    public boolean isEmpty() {

        return index <= 0;
    }
    public boolean isFull() {

        return index >= data.length;
    }


}
