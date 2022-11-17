
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class pruebas {
    static public void main(String[] args) {
        System.out.println(findUniq(new double[] { 1, 1, 1, 2, 1, 1 }));
    }

    public static double findUniq(double arr[]) {
        double res = 0;
        //double[] arr_ord = Arrays.sort(arr);
        Arrays.sort(arr); 

        for(int x = 0; x<arr.length-1; x++){
            if(x == 0) res = arr[x]; //take the first number
            if(arr[x] == res){
                res = arr[x+1]; //if actual number equals saved number take next
            } 
        }  
        return res;
      }
}
