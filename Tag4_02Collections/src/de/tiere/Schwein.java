package de.tiere;

import java.util.Objects;

public class Schwein implements Comparable<Schwein>{

    private String name;
    private int gewicht;
    public Schwein() {
        this("nobody");
    }

    public Schwein(String name) {
        this.name = name;
        this.gewicht =10;
    }

    public Schwein(String name, int gewicht) {
        this.name = name;
        this.gewicht =gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return "Schwein{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schwein schwein = (Schwein) o;
        return gewicht == schwein.gewicht && Objects.equals(name, schwein.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gewicht);
    }

    @Override
    public int compareTo(Schwein other) {
        return this.gewicht - other.gewicht;
    }
}
