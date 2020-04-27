package br.com.visitor;

import br.com.beans.Numero;
import br.com.beans.Soma;
import br.com.beans.Subtracao;

public class ImpressoraPreFixa implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {	
		System.out.print("(");
		System.out.print("+");
		soma.getEsquerda().aceita(this);
		System.out.print(",");
		soma.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaSubracao(Subtracao subtracao) {
		System.out.print("(");
		System.out.print("-");
		subtracao.getEsquerda().aceita(this);
		System.out.print(",");
		subtracao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

}
