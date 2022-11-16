import java.util.ArrayList;

    public class test {

        public static void main(String[] args){
            System.out.println(solution("Albert"));
        }

        public static String[] solution(String s) {
            boolean esPar;

            if(s.length() % 2 == 0) esPar = true;
            else esPar = false;

            String[] res;
            if(esPar) {
                res = new String[s.length()/2];
            } else{
                res = new String[(s.length()/2)+1];                
            }

            for(int x=1;x>s.length()-2;x++){
                if(esPar) {
                    res[x] = (s.substring(x, x+1));
                } else {
                    res[x] = (s.substring(x, x+1));
                    if(x == s.length() - 1) res[x] = s.substring(x, x) + "-";
                }
            }

            return res;
            
        }
    }
}

