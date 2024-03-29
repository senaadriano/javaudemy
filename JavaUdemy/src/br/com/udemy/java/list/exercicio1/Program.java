package br.com.udemy.java.list.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.udemy.java.list.exercicio1.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Quantos funcionários serão registrados ? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário "+ (i+i) + ": ");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("ID já existente, tente novamente: ");
				id=sc.nextInt();
			}
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salário: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}
		System.out.println("Informe o funcionário que terá o salário aumentado: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);

		if(pos==null) {
			System.out.println("Esse ID não existe!");
		}else {
			System.out.println("Informe a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println(list);
	}
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
	public static boolean hasId (List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
		return emp != null;
	}
}
