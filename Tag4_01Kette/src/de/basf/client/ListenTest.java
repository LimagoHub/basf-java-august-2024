package de.basf.client;

import java.util.Scanner;

import de.basf.collections.Liste;
import de.basf.collections.ListeImpl;
import de.tiere.Schwein;

public class ListenTest {

    private Scanner scanner = new Scanner(System.in);


    public void run() {

        Liste<Schwein> listeImpl = new ListeImpl<>();

        while(true) {
            switch (showMenu()) {
                case 0: System.exit(0);	break;
                case 1: listeImpl.append(createSchwein());;	break;
                case 2: System.out.println(listeImpl.get()==null?"Kein Schwein vorhanden": listeImpl.get());;	break;
                case 3: listeImpl.update(createSchwein());	break;
                case 4: listeImpl.remove();	break;
                case 5: listeImpl.moveFirst();	break;
                case 6: listeImpl.moveLast();	break;
                case 7: listeImpl.movePrev();	break;
                case 8: listeImpl.moveNext();	break;
                case 9: System.out.printf("empty = %s, bol = %s, eol = %s\n", listeImpl.isEmpty(), listeImpl.isBOL(), listeImpl.isEOL());	break;


            }

        }

    }

    private int showMenu() {

        System.out.println("0........Ende");
        System.out.println("1........Neu");
        System.out.println("2........Anzeigen");
        System.out.println("3........Ändern");
        System.out.println("4........Löschen");
        System.out.println("5........zum Ersten");
        System.out.println("6........zum Letzten");
        System.out.println("7........zum Vorgänger");
        System.out.println("8........zum Nachfolger");
        System.out.println("9........Status anzeigen");
        return scanner.nextInt();
    }

    private de.tiere.Schwein createSchwein() {
        System.out.print("Bitte geben Sie dem Schwein einen Namen: ");
        return new Schwein(scanner.next());
    }
}
