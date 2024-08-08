package gui;

import java.awt.*;

public class Fenster extends Frame{

    private int counter = 0;
    public Fenster() {
        setTitle("Ein tolles Fenster");
        setSize(400,300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Hallo Fenster: " + counter ++, 50, 50);
        g.drawLine(10,10,200,200);
        g.fillRect(10,10,200,200);
        g.drawOval(10,10,200,200);
    }

    public static void main(String[] args) {

        new Fenster();
    }
}