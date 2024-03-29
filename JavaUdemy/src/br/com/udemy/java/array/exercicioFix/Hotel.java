package br.com.udemy.java.array.exercicioFix;

import java.util.Scanner;

import br.com.udemy.java.array.exercicioFix.entities.Estudante;

public class Hotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Estudante[] vect = new Estudante[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		String name, email;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Qual nome do "+(i+1)+ " aluguel? ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Qual email: ");
			email = sc.nextLine();
			System.out.println("Quarto: ");
			int roomNumb = sc.nextInt();
			
			vect[roomNumb] = new Estudante(name, email);
		}
		System.out.println("-------ALUGADOS-------");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i]!= null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
	}
}
