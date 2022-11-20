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
        System.out.println(findEvenIndex(new int[] { -4264,9765,-3033,-8749,9297,7089,-7538,5527,-1141,-9733,-1735,4339,-192,9269,7477,2485,8940,-3230,5611,-4180,-8272,9976,-3257,-3393,5993,-3650,-4828,-4220,2652,672,-3597,-6357,-1846,2964,-7005,3062,7749,-5257,3190,7331,3903,4450,-6779,8692,19,-7988,-2195,-7156,-4017,7227,-2421,-159,-838,6923,-2909,-7624,-7879,-8109,2450,8767,-3347,-3902,3839,-197,2609,-2081,4864,-3815,9604,5987,8042,-3621,9824,666,3732,3532,970,6278,-1559,-5569,-213,8889,-2348,-6429,8712,-183,8186,-9016,-9198,-4030,5628,3790,-8546,4698,3423,-1702,9296,3062,2001,2044,3252,9254,8667,3234,7892,-2655,1952,-1096,-4985,5641,7763,-7562,5839,-6388,-1116,-3846,5195,-7283,4271,5276,-3157,-7625,25,-4099,7286,3934,-9889,1470,-5606,-7299,-8441,-265,6743,912,-3717,-4592,9660,2978,9648,-7589,4877,-1553,4497,-5945,2026,-2190,-1370,9496,-7687,-8394,3543,446,7374,-5738,2765,-6574,-407,657,-774,9682,-5858,5633,2819,7453,-2519,-5507,-8304,9420,2291,-4025,-6162,1896,4591,-1700,-1001,1771,5211,3566,5439,-7814,4860,-3874,-9332,8597,-323,6518,-9078,-6859,2496,4095,219,7121,-6077,8756,-3426,-1081,6946,-5065,-9682,7841,8900,9539,7442,3111,5472,-451,9513,-8329,-7184,4745,-9048,-1568,5919,-3682,4310,8286,-5974,-6881,4670,448,-2757,3841,-4554,2599,2345,5682,-466,4804,386,-2182,-7816,1351,-6127,1516,-5084,-7601,7069,-2221,3447,-3258,-593,-1887,6796,1976,9084,-5637,9634,9075,1510,9503,-4586,-5452,5671,-7158,3934,-4649,-9676,-9646,3716,-846,1535,-6396,-3023,-4217,-6790,9270,2909,-5631,-6883,-4705,3641,-4831,-1728,-558,6474,5027,5656,-8685,-4159,1083,-3133,-78,-1049,-1378,8656,-4614,-9850,5840,-4833,5657,-9164,-9179,2316,-3122,4045,4181,9851,9538,-4103,-5435,-7498,-8386,-367,3641,8006,4630,-7736,-7818,-3147,-1156,-1317,9538,-3678,-184,-6397,-4999,9580,90,-2223,-8448,9652,7028,1708,-117,-2455,579,-2580,3843,-5993,3298,-3165,-2850,5214,-1046,3937,-4355,4089,-4190,7116,9358,-8978,-4028,7979,-5677,412,3168,3368,5349,2779,-2109,8473,7805,-3890,-8927,-9364,-930,4646,-4757,-4162,-1623,8500,5631,-7203,7580,-6700,2715,-6699,4776,41229,7707,5837,-9190,134,-5466,1820,-5130,6057,-4171,7006,5031,5646,-6460,5511,9183,4811,196,8351,-6755,7759,4751,-915,584,5624,273,-3169,6978,-5012,-6975,6169,7543,5497,-7445,-4487,7302,-4334,-1975,-1791,8092,6448,40853 })); // 1

    }

    public static int findEvenIndex(int[] arr) {
        int index_medio = 0;
        long SumArray = IntStream.of(arr).sum();
        long SumAcum_1part = 0;
        long SumAcum_2part = 0;

        for (int pos_index = 0; pos_index < arr.length; pos_index++) {
            if(SumAcum_1part > 110000){
                System.out.println("stop");
            }
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
            
            System.out.println("Entra aqui");
            System.out.println(SumAcum_1part);
            System.out.println(SumAcum_2part);
            System.out.println("Index: " + index_medio);
            System.out.println("num index: " + arr[index_medio]);
            System.out.println("resta: " + (SumAcum_1part - arr[index_medio]));

            index_medio = -1;
        return index_medio;
    }

}
