package de.tiere;


import java.util.Objects;

public class Schwein implements AutoCloseable{

    private String name;
    private int gewicht;

    private static int counter;

    static {
        counter = 0;

    }

    public static int getCounter() {
        return counter;
    }

    public Schwein() {
        this("Nobody");
    }



    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
        counter ++;

    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        this.gewicht = gewicht;
    }

    public void fuettern(){
        gewicht ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Das Schwein " + name + " ist tot");
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Schwein schwein = (Schwein) o;
        return gewicht == schwein.gewicht && Objects.equals(name, schwein.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gewicht);
    }
}