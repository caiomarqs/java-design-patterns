package br.com.beans;

//O numero é uma expressão de um entra e não opera nada
public class Numero implements Expressao {
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return this.numero;
	}
}
