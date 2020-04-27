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
		throw new RuntimeException("O or�amento j� passou pela a APROVA��O n�o pode ser aplicado o desconto novamente");
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
		throw new RuntimeException("Um or�amento EM_APROVA��O n�o pode ser FINAIZADO diretamente");
	}

}
