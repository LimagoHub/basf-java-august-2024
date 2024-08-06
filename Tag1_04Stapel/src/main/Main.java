package main;

import de.basf.collections.Stapel;

public class Main {
    public static void main(String[] args) {

        Stapel stapel = new Stapel();
        for (int i = 0; i < 10 ; i++) {
            if(! stapel.isFull())
                stapel.push(i);
        }
        while( !stapel.isEmpty()) {
            System.out.println(stapel.pop());
        }

    }
}