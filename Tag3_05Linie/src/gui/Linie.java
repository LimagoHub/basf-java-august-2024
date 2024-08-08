package gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Linie extends Frame  {

    private static final int SIZE = 500;

    private BufferedImage image = new BufferedImage(SIZE,SIZE,BufferedImage.TYPE_INT_RGB);

    public Linie() {

        setSize(SIZE,SIZE);
        setResizable(false);
        addMouseListener(new MyMouseListener());
        addWindowListener(new WindowAdapter(){
            {
                System.out.println("Ctor");
            }
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        } );
        setVisible(true);
    }
    public static void main(String[] args) {
       new Linie();
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image,0,0,SIZE,SIZE, this);
    }

   private class MyMouseListener extends MouseAdapter {
        private int x,y;
       @Override
       public void mousePressed(MouseEvent e) {
          x = e.getX();
          y=e.getY();
       }

       @Override
       public void mouseReleased(MouseEvent e) {
          Graphics g = image.getGraphics();
          g.drawLine(x,y,e.getX(), e.getY());
          g.dispose();
          Linie.this.repaint();
       }
   }

  /* private class MyWindowListener extends WindowAdapter {
       @Override
       public void windowClosing(WindowEvent e) {
           dispose();
       }
   }*/
}