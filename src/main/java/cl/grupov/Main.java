package cl.grupov;

public class Main {
    public static void main(String[] args) {
        int suma = Main.suma(1,2);
        int resta = Main.resta(4, 2);

        System.out.println("Suma de 1 + 2 = " + suma);
        System.out.println("Resta de 4 - 2 = " + resta);
    }

    public static int suma(int a, int b) {
           return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }
}