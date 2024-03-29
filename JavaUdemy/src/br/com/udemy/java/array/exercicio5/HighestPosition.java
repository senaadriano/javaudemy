package br.com.udemy.java.array.exercicio5;

import java.util.Scanner;

public class HighestPosition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 0, posmaior = 0;
		double maior = 0;
		System.out.println("Quantidade de números: ");
		n=sc.nextInt();
		
		double vect[] = new double [n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Informe o número: " + (i+1));
			vect[i] = sc.nextDouble();
		}
		maior = vect[0];
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i]>maior) {
				maior = vect[i];
				posmaior = i;
			}
		}
		System.out.println("Maior valor = " + maior);
		System.out.println("Posição do maior valor = "+ posmaior);
	}

}
