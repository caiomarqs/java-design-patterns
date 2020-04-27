package br.com.beans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.states.EmAprovacao;
import br.com.states.EstadoOrcamento;

public class Orcamento {
	
	private double valor;
	private final List<Item> itens;
	
	private EstadoOrcamento estadoOrcamento;
	
	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoOrcamento = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(itens);
	}
	
	public void setEstadoOrcamento(EstadoOrcamento estadoOrcamento) {
		this.estadoOrcamento = estadoOrcamento;
	}

	public void aplicaDescontoExtra() {
		estadoOrcamento.aplicaDescontoExtra(this);
	}
	
	public void aprovar() {
		estadoOrcamento.aprovar(this);
	}
	
	public void reprovar() {
		estadoOrcamento.reprovar(this);
	}
	
	public void finalizar() {
		estadoOrcamento.finalizar(this);
	}
}
