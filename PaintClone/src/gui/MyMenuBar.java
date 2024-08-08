package gui;

import javax.swing.*;
import java.awt.*;

public class MyMenuBar extends MenuBar {

    public MyMenuBar() {
        Menu menu;
        MenuItem menuItem;

        menu = new Menu("Datei");
        menuItem = new MenuItem("beenden");
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
    }
}
