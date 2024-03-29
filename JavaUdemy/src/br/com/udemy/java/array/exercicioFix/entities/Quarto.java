package br.com.udemy.java.array.exercicioFix.entities;

public class Quarto {
	
	private int numQuarto;

	public Quarto() {}

	public Quarto(int numQuarto) {
		super();
		this.numQuarto = numQuarto;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	@Override
	public String toString() {
		return "Quarto [numQuarto=" + numQuarto + "]";
	}
	
}
