package br.com.beans;

import br.com.visitor.Visitor;

public class Soma implements Expressao {
	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		
		return (valorDaEsquerda + valorDaDireita);
	}
	
	public Expressao getDireita() {
		return direita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}

	
	//Aqui é o aceite da soma onde ela aceita o vistor e excuta o metodo que recebe ele como param
	@Override
	public void aceita(Visitor imporessora) {
		imporessora.visitaSoma(this);
	}
}
