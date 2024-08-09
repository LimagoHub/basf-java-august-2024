package de.basf.collections;

/**
 * Eine tolle Klasse
 */
public class ListeImpl<T> implements Liste<T> {

    private Knoten<T> start;
    private Knoten<T> akt;
    public ListeImpl() {
        start = akt = null;
    }

    @Override
    public void append(T value) {
        Knoten<T> node = new Knoten<>(value);
        if(isEmpty()) {
            start = node;
        } else {
            moveLast();
            akt.nach = node;
            node.vor = akt;

        }
        akt = node;
    }

    @Override
    public boolean remove() {
        if(isEmpty()) return false;
        if(isBOL() && isEOL()){
            start = akt =  null;
            return true;
        }
        if(isBOL()) {
            start = akt.nach;
            start.vor = null;
            moveNext();
            return true;
        }
        if(isEOL()) {
            movePrev();
            akt.nach = null;
            return true;
        }
        akt.vor.nach = akt.nach;
        akt.nach.vor = akt.vor;
        moveNext();
        return true;
    }

    @Override
    public boolean update(T newValue) {
        if(isEmpty())return false;
        akt.payload = newValue;
        return true;
    }

    @Override
    public T get() {
        if(isEmpty()) return null;
        return akt.payload;
    }

    @Override
    public boolean moveFirst() {
        if(isEmpty()) return false;
        akt = start;
        return true;
    }




    @Override
    public boolean movePrev() {
        if(isBOL()) return false;
        akt = akt.vor;
        return true;
    }

    @Override
    public boolean moveNext() {
        if(isEOL()) return false;
        akt = akt.nach;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    /**
     * liefert true wenn wir entweder AUF dem ersten Satz stehen
     * oder die Liste leer ist
     */
    @Override
    public boolean isBOL() {
        return start == akt ;
    }

    /**
     * liefert true wenn wir entweder AUF dem letzten Satz stehen
     * oder die Liste leer ist
     */
    @Override
    public boolean isEOL() {
        return isEmpty() || akt.nach == null;
    }



    private class Knoten<T> {
        T payload;
        Knoten<T> vor, nach;

        public Knoten(T payload) {
            this.payload = payload;
            vor = nach = null;
        }
    }
}
