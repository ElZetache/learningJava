package awesomeSauce;

public class TesterIf {
	public static void main(String[] args) {
		int testNumber = 0;
		boolean checkSize = (5==5); //podemos poner comparaciones para inicializar los booleanos
		if(testNumber <= 0) {
			System.out.println("lees or equal to zero");
			if(checkSize) {
				System.out.println("Less than zero and checksize is true!");
			}
		}
		if(testNumber > 6) {
			System.out.println("grater than 6");
		}
		System.out.println("This will print no matter what.");
		
	}
}
