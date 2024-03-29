package br.com.udemy.java.array.exercicio1;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int vect[] = new int[n];
		
		for (int i = 0; i <vect.length; i++) {
			int n2 = sc.nextInt();
			vect [i] = n2;
		}
		System.out.println("NEGATIVOS");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i]<0) {
				System.out.println(vect[i]);
			}
		}
	}
}
