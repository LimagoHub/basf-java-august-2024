package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintClone extends Frame {

    private static final int SIZE = 1000;

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
        setMenuBar(new MyMenuBar(this));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               beenden();
            }
        });
    }

    public static void main(String[] args) {

        new PaintClone().setVisible(true);
    }

    public void beenden() {
        dispose();
    }
}