package br.com.runner;

import br.com.beans.Orcamento;

public class Runner {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprovar();
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finalizar();
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprovar();
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}
}
