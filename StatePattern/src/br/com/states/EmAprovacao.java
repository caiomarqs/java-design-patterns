package br.com.states;

import br.com.beans.Orcamento;

public class EmAprovacao implements EstadoOrcamento {
	
	private boolean thisStatus = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(thisStatus == false) {
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.05));
			thisStatus = true;
			return;
		}
		throw new RuntimeException("O orçamento já passou pela a APROVAÇÃO não pode ser aplicado o desconto novamente");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Reprovado());
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Um orçamento EM_APROVAÇÃO não pode ser FINAIZADO diretamente");
	}

}
