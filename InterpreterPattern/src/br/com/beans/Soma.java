package br.com.beans;

//A soma é um expressao de duas entradas e realiza um operacao com suas entradas
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
}
