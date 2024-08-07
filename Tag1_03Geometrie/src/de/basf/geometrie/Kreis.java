package de.basf.geometrie;

public class Kreis extends Punkt{
    private double radius;


    public Kreis() {
        this(0,0,0);
    }
    public Kreis(double radius) {
       this(radius,0,0);
    }
    public Kreis(double x, double y) {
        this(0,x,y);

    }

    public Kreis(double radius, double x, double y) {
        super(x,y);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "radius=" + radius;
    }
}
