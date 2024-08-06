package de.basf.spiel;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);

        final int zufallszahl = 623;
        int versuch;
        do {
            System.out.print("Bitte gegen Sie Ihren Versuch ein: ");
            versuch = in.nextInt();
            if(versuch > zufallszahl) System.out.println("Ihr Versuch ist zu gross");
            if(versuch < zufallszahl) System.out.println("Ihr Versuch ist zu klein");

        } while(versuch != zufallszahl);

        System.out.println("Sie haben die Zahl geraten!");
    }
}