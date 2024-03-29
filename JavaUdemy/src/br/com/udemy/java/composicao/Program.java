package br.com.udemy.java.composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.udemy.java.composicao.entities.Department;
import br.com.udemy.java.composicao.entities.HourContract;
import br.com.udemy.java.composicao.entities.Worker;
import br.com.udemy.java.composicao.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Digite os dados do trabalhador ");
		System.out.println("Nome: ");
		String workerName=sc.nextLine();
		System.out.println("Level: ");
		String workerLevel=sc.nextLine();
		System.out.println("Salario Base: ");
		double baseSalary=sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));


		System.out.println("Quantos contratos para esse trabalhador? ");
		int n = sc.nextInt();
		for (int i = 0; i <n; i++) {
			System.out.println("Entre com os dados do contato "+(i+1));
			System.out.println("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duração (horas): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.println("Entre com o mês e ano para calcular(MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Recebeu " + monthAndYear + ": "+worker.income(year, month));
	}

}
