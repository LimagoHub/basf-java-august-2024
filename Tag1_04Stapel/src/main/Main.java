package main;

import de.basf.collections.Stapel;
import geometrie.Kreis;
import geometrie.Punkt;
import tiere.Schwein;

public class Main {
    public static void main(String[] args) {

        Stapel stapel = new Stapel(40);
        for (int i = 0; i < 10 ; i++) {
           stapel.push(new Schwein("Schwein nr. " + i));
            stapel.push(new Punkt(i,i));
            stapel.push(new Kreis(i));
        }
        while( !stapel.isEmpty()) {
            System.out.println(stapel.pop());
        }

    }
}