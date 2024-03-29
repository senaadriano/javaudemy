package br.com.udemy.java.array;

import java.util.Scanner;

import br.com.udemy.java.array.entities.Product;

public class Vector2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Nome do produto: " + (i+1) );
			String name = sc.nextLine();
			System.out.println("Preço do produto: " + (i+1));
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		System.out.println("Average price: " + avg);
	}

}
