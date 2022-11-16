package teoria;

import java.util.ArrayList;

public class excepciones {
    public static void main(String[] args) throws ArithmeticException {
        int x = 3;
        int[] y = new int[1];
        ArrayList<String> z = null;

        try {
            x = x / 0;
            y[2] = 3;
            z.get(3);
        } catch (ArithmeticException e) {
            System.out.println("no se puede dividir entre 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index fuera de rango");
        } catch (Exception e) {
            e.printStackTrace(); // ! esta funcion es la que hace por defecto java al lanzar un error
        } finally {
            System.out.println("lo que esta dentro de finally siempre se executa");
        }

    }
}
