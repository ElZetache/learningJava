package awesomeSauce;

public class TesterElse {
	public static void main(String[] args) {
		double lenghtX = 4.21;
		double lenghtY = 3.8231;
		boolean isTriangle = false;
		boolean isRectangle = false;
		double area = 0;
		
		if(isTriangle) {
			area = (lenghtX * lenghtY)/2.0;
		} else if(isRectangle){
			area = (lenghtX * lenghtY);
		} else {
			System.out.println("no tenemos la formula para este poligono.");
		}
			
		System.out.println("your area is: " + area);
	}
}
