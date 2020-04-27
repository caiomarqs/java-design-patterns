package br.com.states;

import br.com.beans.Orcamento;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Somente o orcamento EM_APROVA��O ou APROVADO recebem descontos");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Um or�amento REPROVADO n�o pode ser APROVADO");	
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento j� est� REPROVADO");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Finalizado());
	}

}
