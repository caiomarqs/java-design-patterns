package br.com.states;

import br.com.beans.Orcamento;

public class Aprovado implements EstadoOrcamento {

	private boolean thisStatus = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(thisStatus == false) {
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.02));
			thisStatus = true;
			return;
		}
		throw new RuntimeException("O or�amento j� passou pela a APROVA��O n�o pode ser aplicado o desconto novamente");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento j� est� APROVADO");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Um or�amento APROVADO n�o pode ser REPROVADO");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Finalizado());
	}

}
