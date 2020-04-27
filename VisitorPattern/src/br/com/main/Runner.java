package br.com.main;

import br.com.beans.Expressao;
import br.com.beans.Numero;
import br.com.beans.Soma;
import br.com.beans.Subtracao;
import br.com.visitor.ImpressoraPreFixa;
import br.com.visitor.ImpressoraVisitor;
import br.com.visitor.Visitor;

public class Runner {
	
	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		
		Expressao soma = new Soma(esquerda, direita);
		
		System.out.println(soma.avalia());
		
		Visitor impressora = new ImpressoraVisitor();
		soma.aceita(impressora); // --> Imprimindo com uma impressora norma que implenta o visitor, tem um medo para manipular cada bean
		
		Visitor impresoraPreFixa = new ImpressoraPreFixa();
		System.out.println("");
		soma.aceita(impresoraPreFixa); // --> A soma e todos os nos abaixo dessa caideia ira aceitar esse visitor
	}

}
