package br.com.udemy.java.array.exercicio3;

import java.util.Scanner;

import br.com.udemy.java.array.exercicio3.entities.People;

public class Schedule {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sixteen = 0,n = 0; 
		double totalHeight = 0, avgHeight = 0, percSmaller = 0;
		
		System.out.println("Number of people");
		n=sc.nextInt();
		
		People[] schedule = new People[n];
		
		for (int i = 0; i < schedule.length; i++) {
			sc.nextLine();
			String name;
			int age;
			double height;
			System.out.println("Name: " + i);
			name = sc.nextLine();
			System.out.println("Age: " + i);
			age = sc.nextInt();
			System.out.println("Height: " + i);
			height = sc.nextDouble();
			
			schedule[i] = new People(name, age, height);
		}
		for (int i = 0; i < schedule.length; i++) {
			if(schedule[i].getAge()<16) {
				sixteen ++;
			}
			totalHeight = totalHeight +schedule[i].getHeight();
		}
		avgHeight = totalHeight/n;
		percSmaller = ((double)sixteen/n)*100;
		
		System.out.println("\nAverage height: " + avgHeight);
		System.out.println("Under 16 years old: " + percSmaller);
		
		for (int i = 0; i < schedule.length; i++) {
			if(schedule[i].getAge()<16) {
				System.out.println("\nNames: " + schedule[i].getName());
			}
		}
		sc.close();
	}

}
