import java.lang.reflect.Array;

public class pruebas {
    static public void main(String[] args) {
        int[] a = new int[0];
        int[] b = new int[0];
        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        boolean res = true;
        boolean encontrado = false;
        //compruebo que los valores no esten a null, si lo estan retorno false
        if (a != null && b != null) {
            if (a.length != b.length)
                res = false;
        } else {
            res = false;
        }
        //en caso de que ambos valores tengan datos los recorro
        for (int val_a : a) {
            encontrado = false;

            System.out.println(val_a);
            System.out.println("-------");
            int long_b = b.length;
            for (int x = 0; x < long_b; x++) {
                if (Math.pow(val_a, 2) == b[x] && encontrado == false) {
                    //si encuentra el valor lo marco como encontrado e informo el elemento con -1 para
                    //que no lo vuelva a coger
                    encontrado = true;
                    b[x] = -1;

                }
                System.out.println(b[x]);

            }
            //si hay algun valor que no encuentra devuelvo false
            if (encontrado != true) {
                res = false;
            }
        }
        //si ambos campos estan vacios lo marco como true
        if (a != null && b != null) {
            if (a.length == 0 && b.length == 0)
                res = true;
        }
        return res;
    }

}
