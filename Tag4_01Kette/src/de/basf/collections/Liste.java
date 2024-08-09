package de.basf.collections;

public interface Liste<T> {
    void append(T value);

    boolean remove();

    boolean update(T newValue);

    T get();

    boolean moveFirst();

    default   boolean moveLast() {
        if(isEmpty()) return false;
        while(moveNext()){}
        return true;
    }

    boolean movePrev();

    boolean moveNext();

    boolean isEmpty();

    boolean isBOL();

    boolean isEOL();
}
