package gui;

import java.awt.*;

public class PaintClone extends Frame {

    private static final int SIZE = 1000;

    public PaintClone() {
        setTitle("PaintClone");
        setSize(SIZE, SIZE);
        setMenuBar(new MyMenuBar());
    }

    public static void main(String[] args) {

        new PaintClone().setVisible(true);
    }
}