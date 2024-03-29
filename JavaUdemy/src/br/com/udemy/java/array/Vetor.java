package br.com.udemy.java.array;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum/n;
		
		System.out.println("Average height: " + avg);
		sc.close();
	}

}
