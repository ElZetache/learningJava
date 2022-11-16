
public class dividirPalabra {

    public static void main(String[] args) {
        System.out.println("Hola");
        String res[] = solution("Albert");
        System.out.print(res[0]);
        for(int x=1;x<res.length;x++){
            System.out.print("," + res[x]);
            
        }
        

    }

    public static String[] solution(String s) {
        boolean esPar;
        int pos_array = 0;
        int longitud;
        longitud = s.length();

        if (longitud % 2 == 0)
            esPar = true;
        else
            esPar = false;

        String[] res;
        if (esPar) {
            res = new String[longitud / 2];
        } else {
            res = new String[(longitud / 2) + 1];
        }

        for (int x = 0; x < s.length() - 1; x = x + 2) {
            if (longitud % 2 == 0) {
                res[pos_array] = (s.substring(x, x + 2));
                pos_array++;
            } else {
                res[pos_array] = (s.substring(x, x + 2));
                pos_array++;
            }

        }
        if (!esPar) {
            res[longitud / 2] = s.substring(longitud - 1, longitud) + "_";
        }

        return res;

    }
}
