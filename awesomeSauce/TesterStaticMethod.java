package awesomeSauce;

public class TesterStaticMethod {
	public static void main(String[] args) {
		System.out.println(power(3,2));
		System.out.println(power(2,4));
		System.out.println(factorial(4));
		printError("something went wrong");		
	}
	
	private static double power(double base, int power) {
		double ret = 1.0;
		while(power>0) {
			ret = ret*base;
			power--;
		}
		return ret;
		
	}
	
	private static int factorial(int i) {
		if(i == 1) return 1;
		return factorial(i-1)*i;
	}
	
	private static void printError(String error) {
		System.out.println("An error occured: " + error);
	}
	
}
