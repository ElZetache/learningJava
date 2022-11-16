package awesomeSauce;

public class Tester {
	public static void main(String[] args) {
		int circleRadius = 3;
		//Las variables con final son fijas y no pueden variar:
		final double pi = 3.1415;
		double area = circleRadius * circleRadius * pi;
		
		
		System.out.println("My circle has a area of " + area + " units.");
		circleRadius = circleRadius + 2;
		area = circleRadius * circleRadius * pi;
		System.out.println("My circle has a area of " + area + " units.");
	}
}
