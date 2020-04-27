package br.com.visitor;

import br.com.beans.Numero;
import br.com.beans.Soma;
import br.com.beans.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubracao(Subtracao subtracao);

	void visitaNumero(Numero numero);

}