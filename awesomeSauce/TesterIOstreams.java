package awesomeSauce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TesterIOstreams {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
		PrintWriter salida = new PrintWriter(bw);
		int i = 1;
		while(i<9970) {
			if(isPrime(i)) {
				salida.println(i);
			}
			i++;
		}
		salida.close();
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		int target = 54225;
		int remaining = target;
		int nextPrime = 1;
		String factorization = "";
		while(remaining > 1) {
			do {
				nextPrime = Integer.parseInt(br.readLine());
			}while(remaining % nextPrime != 0);
			while(remaining % nextPrime == 0) {
				remaining = remaining/nextPrime;
				factorization = factorization + nextPrime + " ";
			}
		}
		System.out.println("prime factorization of " + target + " is " + factorization);
	}
	
	private static boolean isPrime(int k) {
		if(k==1) return false;
		int stop = (int) Math.sqrt(k);
		int i=2;
		while(i<=stop) {
			if(k%i == 0) return false;
			i++;
		}		
		return true;
	}
}
