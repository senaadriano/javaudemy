package br.com.udemy.java.array.exercicio2;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double sum= 0, avg;
		
		System.out.println("How many numbers will be entered? ");
		n= sc.nextInt();
		double vect[] = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Enter a value: ");
			vect[i] =sc.nextDouble();
		}
		
		for (int i = 0; i < vect.length; i++) {
			sum = sum+vect[i];
		}
		avg = sum/n;
		System.out.println("VALUES THE VECTOR");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Position value " + vect[i]);
		}
		System.out.println("SUM: " + sum);
		System.out.println("AVERAGE: " + avg);
	}

}
