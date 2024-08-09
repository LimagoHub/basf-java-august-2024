package de.basf.collections;

/**
 * Eine tolle Klasse
 */
public class Liste {

    private Knoten start;
    private Knoten akt;
    public Liste() {
        start = akt = null;
    }

    public void append(Object value) {
        Knoten node = new Knoten(value);
        if(isEmpty()) {
            start = node;
        } else {
            moveLast();
            akt.nach = node;
            node.vor = akt;

        }
        akt = node;
    }

    public boolean remove() {
        return false;
    }

    public boolean update(Object newValue) {
        return false;
    }

    public boolean moveFirst() {
        return false;
    }

    public boolean moveLast() {
        return false;
    }

    public boolean movePrev() {
        return false;
    }

    public boolean moveNext() {
        return false;
    }

    public boolean isEmpty() {
        return start == null;
    }

    /**
     * liefert true wenn wir entweder AUF dem ersten Satz stehen
     * oder die Liste leer ist
     */
    public boolean isBOL() {
        return start == akt ;
    }

    /**
     * liefert true wenn wir entweder AUF dem letzten Satz stehen
     * oder die Liste leer ist
     */
    public boolean isEOL() {
        return isEmpty() || akt.nach == null;
    }



    private class Knoten {
        Object payload;
        Knoten vor, nach;

        public Knoten(Object payload) {
            this.payload = payload;
            vor = nach = null;
        }
    }
}
