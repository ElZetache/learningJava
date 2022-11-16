package awesomeSauce;

import java.util.Random;

public class TesterMath {
	public static void main(String[] args) {
		double d = Math.E;
		
		System.out.println(d);
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));
		
		double e = Math.PI;
		e = 100*e;
		e = Math.round(e);
		e = e/100;
		System.out.println(e);
		
		double s = Math.random();
		System.out.println(s);
		
		Random rng = new Random();
		System.out.println(rng.nextInt(4));
		System.out.println(rng.nextInt(4));
		
	}
}
