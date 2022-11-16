package awesomeSauce;

public class TesterStrings {
	public static void main(String[] args) {
		String argOne = args[0];
		String append = new String(" and i will be happy");
		argOne += append;
		System.out.println("argOne: " + argOne + ". Of lenght: " + argOne.length());
		
		//cogemos la posicion de la T para eliminarla via substring
		int toDelete = argOne.indexOf("T");
		argOne = argOne.substring(0, toDelete) + argOne.substring(toDelete+1 , argOne.length());
		
		System.out.println(argOne);
		
		
		//trimmed para quiar espacios delante y detras del string
		String noSpaces = "   hi mom     ";
		noSpaces = noSpaces.trim();
		System.out.println(noSpaces);
		
		//contains para saber si una string contiene un texto
		if(noSpaces.contains("mom")) {
			System.out.println("contiene mom");
		}else {
			System.out.println("no contiene mom");
		}
			
				
	}
}
