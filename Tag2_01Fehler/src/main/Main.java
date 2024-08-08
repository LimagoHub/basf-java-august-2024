package main;

public class Main {
    public static void main(String[] args) {


        try {
            int [] feld = new int[2];
            int a, b , c;

            a = b = 0;

            c = a /b;
            feld[1000] = 10;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Sie haben ein kleines Programm echt gluecklich gemacht!");
    }

}