package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuBar extends MenuBar {

    private PaintClone paintClone;
    public MyMenuBar(PaintClone paintClone) {
        this.paintClone = paintClone;
        Menu menu;
        MenuItem menuItem;

        menu = new Menu("Datei");
        menuItem = new MenuItem("beenden");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paintClone.beenden();
            }
        });
        menu.add(menuItem);
        add(menu);

        menu = new Menu("Formen");
        menuItem = new MenuItem("Linie");
        menuItem.addActionListener(new MyFormListener(PaintClone.Form.LINIE));
        menu.add(menuItem);
        menuItem = new MenuItem("Rechteck");
        menu.add(menuItem);
        menuItem.addActionListener(new MyFormListener(PaintClone.Form.RECHTECK));
        menuItem = new MenuItem("Oval");
        menuItem.addActionListener(new MyFormListener(PaintClone.Form.OVAL));
        menu.add(menuItem);
        menu.addSeparator();
        menuItem = new MenuItem("Löschen");
        menuItem.addActionListener(new MyFormListener(PaintClone.Form.LÖSCHEN));
        menu.add(menuItem);
        add(menu);

        menu = new Menu("Farben");
        menuItem = new MenuItem("Weiss");
        menuItem.addActionListener(new MyColorListener(Color.WHITE));
        menu.add(menuItem);
        menuItem = new MenuItem("Rot");
        menuItem.addActionListener(new MyColorListener(Color.RED));
        menu.add(menuItem);
        menuItem = new MenuItem("Grün");
        menuItem.addActionListener(new MyColorListener(Color.GREEN));
        menu.add(menuItem);
        menuItem = new MenuItem("Blau");
        menuItem.addActionListener(new MyColorListener(Color.BLUE));
        menu.add(menuItem);
        menuItem = new MenuItem("Gelb");
        menuItem.addActionListener(new MyColorListener(Color.YELLOW));
        menu.add(menuItem);
        menuItem = new MenuItem("Pink");
        menuItem.addActionListener(new MyColorListener(Color.PINK));
        menu.add(menuItem);
        add(menu);
    }

    private class MyColorListener implements ActionListener {

        private Color color;

        public MyColorListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            paintClone.setColor(color);
        }
    }
    private class MyFormListener implements ActionListener {

        private PaintClone.Form form;

        public MyFormListener(PaintClone.Form form) {
            this.form = form;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            paintClone.setForm(form);
        }
    }

}
