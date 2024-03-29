package br.com.udemy.java.array.exercicio3.entities;

public class People {

	private String name;
	private int age;
	private double height;
	
	public People() {}

	public People(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
}
