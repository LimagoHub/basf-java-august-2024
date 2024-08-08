package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuBar extends MenuBar {

    public MyMenuBar(PaintClone paintClone) {
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
        menu.add(menuItem);
        menuItem = new MenuItem("Rechteck");
        menu.add(menuItem);
        menuItem = new MenuItem("Oval");
        menu.add(menuItem);
        menu.addSeparator();
        menuItem = new MenuItem("Löschen");
        menu.add(menuItem);
        add(menu);

        menu = new Menu("Farben");
        menuItem = new MenuItem("Weiss");
        menu.add(menuItem);
        menuItem = new MenuItem("Rot");
        menu.add(menuItem);
        menuItem = new MenuItem("Grün");
        menu.add(menuItem);
        menuItem = new MenuItem("Blau");
        menu.add(menuItem);
        menuItem = new MenuItem("Gelb");
        menu.add(menuItem);
        menuItem = new MenuItem("Pink");
        menu.add(menuItem);
        add(menu);
    }
}
