package br.com.states;

import br.com.beans.Orcamento;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Somente o orcamento EM_APROVAÇÃO ou APROVADO recebem descontos");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Um orçamento REPROVADO não pode ser APROVADO");	
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento já está REPROVADO");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Finalizado());
	}

}
