package br.com.udemy.java.array.exercicio6;

import java.util.Scanner;

public class SumVect {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.println("Quantos elementos vão conter os vetores?");
		n=sc.nextInt();

		int vectA[] = new int [n];
		int vectB[] = new int [n];
		int vectC[] = new int [n];

		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Digite o valor " + i + " do vetor A: ");
			vectA[i] = sc.nextInt();
		}
		for (int i = 0; i < vectB.length; i++) {
			System.out.println("Digite o valor" + i + " do vetor B: ");
			vectB[i] = sc.nextInt();
		}
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i]+vectB[i];
		}
		System.out.println("RESULTADO");
		for (int i = 0; i < vectC.length; i++) {
			System.out.println(vectC[i]);
		}
		sc.close();
	}
}
