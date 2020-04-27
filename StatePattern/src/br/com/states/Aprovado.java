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
		throw new RuntimeException("O orçamento já passou pela a APROVAÇÃO não pode ser aplicado o desconto novamente");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento já está APROVADO");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Um orçamento APROVADO não pode ser REPROVADO");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Finalizado());
	}

}
