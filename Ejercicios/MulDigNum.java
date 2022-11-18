public class MulDigNum {
    //! Este programa cuenta la cantidad de veces que se han de multiplicar los digitos
    //! del numero introducido como valor entre si para que solo quede un digito
    //! pe: 27 --> 2*7 = 14 --> 1*4 = 4  (RES = 2 multiplicaciones)
    public static void main(String[] args) {
        System.out.println(MulDig(27));
    }

    private static int MulDig(long num) {
        long res;
        int cnt = 0;
        long long_num = String.valueOf(num).length();

        while (long_num >= 2) {
            res = 1;
            for (int x = 0; x < long_num; x++) {
                res *= Long.parseLong(String.valueOf(num).substring(x, x + 1));
            }
            num = res;
            long_num = String.valueOf(num).length();
            cnt++;
        }

        return cnt;
    }

}
