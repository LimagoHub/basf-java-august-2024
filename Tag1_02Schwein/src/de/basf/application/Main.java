package de.basf.application;

import de.basf.tiere.Schwein;

public class Main {
    public static void main(String[] args) {

       new Main().run();
    }

    private void run() {
        System.out.println(Schwein.getCounter());

        // DEclaration
        Schwein piggy;
        Schwein babe = new Schwein();
        System.out.println(Schwein.getCounter());

        piggy = new Schwein();
        System.out.println(Schwein.getCounter());
        piggy.setName("Miss Piggy");


        System.out.println(piggy.toString());

        piggy.futtern();;
        System.out.println(piggy.toString());
    }
}