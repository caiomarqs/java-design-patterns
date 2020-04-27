package br.com.beans;

import br.com.visitor.Visitor;

public class Numero implements Expressao {
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return this.numero;
	}
	
	public int getNumero(){
		return this.numero;
	}

	//Aqui é o aceito do numero oonde ele aceita o vistor e excuta o metodo que recebe ele como param
	@Override
	public void aceita(Visitor imporessora) {
		imporessora.visitaNumero(this);
	}
}
