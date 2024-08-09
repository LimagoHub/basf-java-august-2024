package gui;

import java.awt.*;

public class BouncingBall extends Frame{
    private static final int SIZE = 1000;

    private boolean gameOver = false;

    private int x ,y;
    private int xRichtung ,yRichtung;
    public BouncingBall() {
        super("Bouncing Ball");
        x = y = SIZE / 2;
        xRichtung = 1;
        yRichtung = 2;
        setSize(SIZE, SIZE);
        setVisible(true);
        createBufferStrategy(2);
    }
    public static void main(String[] args) {

        new BouncingBall().run();
    }

    private void run() {
        while(! gameOver) {
            calculateScene();
            renderScene();

        }
    }
    private void calculateScene() {
        x += xRichtung;
        y += yRichtung;

        if(x<= 0 ||x >= getWidth())
            xRichtung *= -1;

        if(y<= 0 ||y >= getHeight())
            yRichtung *= -1;
    }
    private void renderScene() {
        Graphics g = null;
        try {
            g = getBufferStrategy().getDrawGraphics();
            g.clearRect(0, 0, getWidth(), getHeight());
            //g.setXORMode(Color.BLUE);
            g.setColor(Color.RED);
            g.fillOval(x,y,20,20);

        } finally {
            if (g != null) {
                g.dispose();
            }

        }
        getBufferStrategy().show();
    }
}