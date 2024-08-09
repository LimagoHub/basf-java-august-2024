package gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class PaintClone extends Frame {

    private static final int SIZE = 1000;
    private BufferedImage image = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);

    public enum Form {LINIE,RECHTECK,OVAL,LÖSCHEN}

    private Form form = Form.LINIE;
    private Color color = Color.WHITE;

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public PaintClone() {
        setTitle("PaintClone");
        setSize(SIZE, SIZE);
        setResizable(false);
        setMenuBar(new MyMenuBar(this));
        addMouseListener(new MyMouseListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               beenden();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {

        new PaintClone().setVisible(true);
    }

    public void beenden() {
        dispose();
    }

    private class MyMouseListener extends MouseAdapter {
        private int x, y;

        @Override
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Graphics g = image.getGraphics();
            g.setColor(color);
            switch (form){
                case LINIE -> g.drawLine(x, y, e.getX(), e.getY());
                case RECHTECK -> g.drawRect(x, y, e.getX()-x, e.getY()-y);
                case OVAL -> g.drawOval(x, y, e.getX()-x, e.getY()-y);
                case LÖSCHEN -> g.clearRect(x, y, e.getX()-x, e.getY()-y);
            }
            g.dispose();
            repaint();

        }
    }
}