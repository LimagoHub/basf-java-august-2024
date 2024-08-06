package de.basf.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte Wert eingeben");

        var value = sc.nextInt();
        System.out.println(value);
        sc.close();

    }
}