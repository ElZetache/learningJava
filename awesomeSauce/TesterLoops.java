package awesomeSauce;

public class TesterLoops {
	public static void main(String[] args) {
		int i=0;
		int[] arr = {1,2,3,4,5,6,7};
		
		while(i<7) {
			System.out.println(arr[i]);
			i++;
		}
		///////////////////////////////////////////////////////////7
		i=0;		
		do {
			System.out.print(arr[i]);
			i++;			
		}while(i<7);
		//////////////////////////////////////////////////////////
		System.out.println("\nfor");
		System.out.println("---");
		for(int x=0;x<7;x++) {
			System.out.print(arr[x]);
		}
	}
}
