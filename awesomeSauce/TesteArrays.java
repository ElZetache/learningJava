package awesomeSauce;

import java.util.ArrayList;

public class TesteArrays {
	public static void main(String[] args) {
		char[] arr = new char[3];
		arr[0] = 'c';
		arr[1] = 'a';
		arr[2] = 't';
		
		char[] arr2 = {1, 2, 3};
		
		System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.println(arr[2]);
		
		System.out.print(arr2[0]);
		System.out.print(arr2[1]);
		System.out.println(arr2[2]);
		
		//Array de dos dimensiones:
		char [][] arr3 = {
				{'a', 'A'},
				{'b', 'B'},
				{'c', 'C'}
		};
		
		System.out.print(arr3[0][0]);
		System.out.print(arr3[1][1]);
		System.out.println(arr3[2][0]);
		
		
		//Ejemplo de ArrayList, metodo para arrays variables
		ArrayList<Integer> arr4 = new ArrayList<Integer>();
		arr4.add(3);
		arr4.add(6);
		System.out.println(arr4.get(1));
		/*en los arrays list al ser un metodo y no una variable nativa tenemos que usar sus funciones
		internas para obtener los datos
		documentacion en docs.oracle.com
		*/
	}
}
