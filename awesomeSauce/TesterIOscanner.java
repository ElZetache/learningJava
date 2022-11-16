package awesomeSauce;

import java.io.File;
import java.util.Scanner;

public class TesterIOscanner {
	public static void main(String[] args) throws Exception {
		File config = new File("config.cfg");		
		double bias;
		boolean decimalAdditionMode = false;			
		Scanner sc = new Scanner(System.in);
		Scanner file = new Scanner(config);
		String line = file.nextLine();
		//quitamos los espacios del fichero
		line = line.replaceAll(" ", "");
		if(!line.substring(0, 22).equalsIgnoreCase("decimalAdditionalMode=")) {
			throwException();			
		}
		if(line.replaceAll(" ", "").substring(22).equalsIgnoreCase("true")) {
			decimalAdditionMode = true;
		}
		line = file.nextLine();
		bias = Double.parseDouble(line.substring(5));  
		if(!decimalAdditionMode) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b+(int)bias);
		}else {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			System.out.println(a+b+bias);
			
		}
		sc.close();
		file.close();
			
		
		
	}

	private static void throwException() throws Exception {
		throw new Exception("config doesn't match");
	}
}
