package br.com.udemy.java.array.exercicio4;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pairs = 0, n = 0;

		System.out.println("Anount of numbers: ");
		n=sc.nextInt();
		int vector[] = new int[n];
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Number: " + (i+1));
			vector[i] = sc.nextInt();
		}
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] %2 == 0) {
				pairs++;
				System.out.print(vector[i] + " ");
			}
		}
		System.out.println("\nAMOUNT OF PAIRS: " + pairs);
	}
}
