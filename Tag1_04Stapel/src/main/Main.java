package main;

import de.basf.collections.Stapel;
import de.basf.collections.StapelException;
import geometrie.Kreis;
import geometrie.Punkt;
import tiere.Schwein;

public class Main {
    public static void main(String[] args) {

        try {
            foo();
        } catch (StapelException e) {
            e.printStackTrace();
        }

    }

    private static void foo() throws StapelException {
        Stapel<Punkt> stapel = new Stapel<>(-40);
        for (int i = 0; i < 10 ; i++) {
           //stapel.push(new Schwein("Schwein nr. " + i));
            stapel.push(new Punkt(i,i));
            stapel.push(new Kreis(i));
           // stapel.push(i);
        }
        while( !stapel.isEmpty()) {
            Punkt punkt = stapel.pop();

            punkt.rechts();
            System.out.println(punkt);


        }
    }
}