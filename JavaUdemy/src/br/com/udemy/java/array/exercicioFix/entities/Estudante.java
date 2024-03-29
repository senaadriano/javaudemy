package br.com.udemy.java.array.exercicioFix.entities;

public class Estudante {

	private String name;
	private String email;
	
	public Estudante() {}

	public Estudante(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Estudante nome: " + name + ", email: " + email + ".";
	}
	
}
