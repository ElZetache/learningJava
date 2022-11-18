import java.util.stream.IntStream;

public class EqualSidesOfArray {
    /*
     * You are going to be given an array of integers. Your job is to take that
     * array and find an index N where the sum of the integers to the left of N is
     * equal to the sum of the integers to the right of N. If there is no index that
     * would make this happen, return -1.
     * 
     * For example:
     * 
     * Let's say you are given the array {1,2,3,4,3,2,1}:
     * Your function will return the index 3, because at the 3rd position of the
     * array, the sum of left side of the index ({1,2,3}) and the sum of the right
     * side of the index ({3,2,1}) both equal 6.
     * 
     * Let's look at another one.
     * You are given the array {1,100,50,-51,1,1}:
     * Your function will return the index 1, because at the 1st position of the
     * array, the sum of left side of the index ({1}) and the sum of the right side
     * of the index ({50,-51,1,1}) both equal 1.
     * 
     * Last one:
     * You are given the array {20,10,-80,10,10,15,35}
     * At index 0 the left side is {}
     * The right side is {10,-80,10,10,15,35}
     * They both are equal to 0 when added. (Empty arrays are equal to 0 in this
     * problem)
     * Index 0 is the place where the left side and right side are equal.
     */
    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] { 1, 2, 3, 4, 3, 2, 1 })); // 3
        System.out.println(findEvenIndex(new int[] { 1, 100, 50, -51, 1, 1 })); // 1

    }

    public static int findEvenIndex(int[] arr) {
        int index_medio = 0;
        double SumArray = IntStream.of(arr).sum();
        double SumAcum_1part = 0;
        double SumAcum_2part = 0;

        for (int pos_index = 0; pos_index < arr.length; pos_index++) {
            if (SumArray / 2 > SumAcum_1part) {
                SumAcum_1part += arr[pos_index];
                if (!(SumArray / 2 > SumAcum_1part))
                // si aun no hemos alcanzado el indice
                {
                    index_medio = pos_index; // donde hemos acumulado la mitad del
                                             // valor pasamos al siguiente

                }
            } else {
                SumAcum_2part += arr[pos_index];
                // calculamos la segunda parte para comprobar que se ha sumado bien
                // en caso de que no se pueda encontar un index en que ambos lados
                // sumen lo mismo se devolverá un -1
            }
        }
        if ((SumAcum_1part - arr[index_medio]) != SumAcum_2part)
            index_medio = -1;
        return index_medio;
    }

}
