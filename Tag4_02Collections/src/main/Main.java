package main;

import de.tiere.Schwein;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Comparator<Schwein> c = new Comparator<Schwein>() {
            @Override
            public int compare(Schwein o1, Schwein o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Set<Schwein> set = new TreeSet<>(c);
        set.add(new Schwein("Piggy", 10));
        set.add(new Schwein("Piggy", 10));
        set.add(new Schwein("Piggy", 10));
        set.add(new Schwein("Baba", 20));
        set.add(new Schwein("Rudi", 15));

        for (Schwein schwein : set) {
            System.out.println(schwein);
        }
    }
}