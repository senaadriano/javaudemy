package br.com.udemy.java.exercicio;

import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Informe o numero da conta: ");
		int number = sc.nextInt();
		
		System.out.println("Informe o nome da conta: ");
		String holder = sc.next();

		System.out.println("Quer fazer um depósito inicial (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Informe o valor do depósito: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			
		}else {
			account = new Account(number, holder);
		}
			
		sc.close();
		
		System.out.println(account);
		
		System.out.println("Depositando R$ 50");
		account.deposit(50);
		System.out.println("Valor atual: " + account.getBalance());
		
		System.out.println("sacando R$ 100");
		account.withdraw(100);
		System.out.println("Valor atual: " + account.getBalance());
		
	}

}
