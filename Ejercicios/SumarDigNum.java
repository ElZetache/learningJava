public class SumarDigNum {
    public static void main(String[] args){
        System.out.println(SumDig(16));
    }

    private static int SumDig(int num){
        int res = 0;
        int long_num = Integer.toString(num).length();

        for(int x = 0;x < long_num;x++) res += Integer.parseInt(Integer.toString(num).substring(x,x+1));
        long_num = Integer.toString(res).length();
        if(long_num >= 2) res = SumDig(res);
    
        return res;
    }

    
}
