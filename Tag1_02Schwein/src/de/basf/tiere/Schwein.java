package de.basf.tiere;

public class Schwein {
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
        name = "nobody";
        setGewicht(10);
        counter ++;
    }

    @Override
    protected void finalize() throws Throwable {
       counter --;
    }

    public String getName() {
        return name;
    }

    public  void setName(final String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        this.gewicht = gewicht;
    }

    public void futtern() {

       setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
