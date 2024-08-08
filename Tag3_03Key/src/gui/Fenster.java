package gui;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Fenster extends Frame implements KeyListener, MouseMotionListener {

    private static final int SIZE = 500;
    private String message = "Hallo Fenster";
    private int x,y;

    public Fenster() {
        setTitle("Ein tolles Fenster");
        setSize(SIZE, SIZE);
        addKeyListener(this);
        addMouseMotionListener(this);
        x = y = SIZE / 2;
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        g.drawString(message , 50, 50);
        g.drawRect(x,y, 20,20);

    }

    public static void main(String[] args) {
        new Fenster();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
        message = "Taste wurde gedrückt";
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x += (e.getX() - x) / 20;
        y += (e.getY() - y) / 20;
        repaint();
    }
}
