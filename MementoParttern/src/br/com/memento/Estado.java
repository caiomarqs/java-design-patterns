package br.com.memento;

import br.com.beans.Contrato;

public class Estado {
	
	//A classe estado é responsavel por guardar o objeto que tem estados alternantes
	
	private Contrato contrato;
	
	public Estado(Contrato contrato) {
		this.contrato = contrato;
	}
	
	public Contrato getEstado() {
		return contrato;
	}
}
