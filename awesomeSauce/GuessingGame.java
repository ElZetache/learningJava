package awesomeSauce;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	
	public static void main(String[] args) {
		Random rng = new Random();
		int correctAnswer = rng.nextInt(101);
		Scanner sc = new Scanner(System.in);
		int rounds = 0;
		int lastGuessed = -212421;
		while(notGuessed(lastGuessed, correctAnswer)) {
			do {
				lastGuessed = sc.nextInt();
			}while(isInvalidInput(lastGuessed));
			if(lastGuessed > correctAnswer) {
				System.out.println("too big!");
			}
			if(lastGuessed < correctAnswer) {
				System.out.println("too low!");
			}
			
			rounds++;
		}
		System.out.println("Correct! you took " + rounds + " rounds");
	}
	
	public static boolean isInvalidInput(double d) {
		if((int)d != d) return true;
		if(d>100 | d<0) return true;
		return false;
	}

	public static boolean notGuessed(int i, int j) {
		if(i==j) return false;
		return true;
	}

}
