package br.com.builders;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.beans.ItemNota;
import br.com.beans.NotaFiscal;
import br.com.observers.AcaoAposNota;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemNota> todosItens = new ArrayList<ItemNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	
	
	//observer -> lista de acoes
	private List<AcaoAposNota> acoesAposNota;
	
	public NotaFiscalBuilder(List<AcaoAposNota> lista) {
		this.acoesAposNota = lista;
	}
	
	public NotaFiscalBuilder() {
		this.acoesAposNota = new ArrayList<AcaoAposNota>();
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data;
		return this;
	}
		
	public NotaFiscal build() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes); 
		
		for (AcaoAposNota acaoAposNota : acoesAposNota) {
			acaoAposNota.executar(nf);
		}
		
		return nf;
	}
	
	public NotaFiscalBuilder adicionarAcao(AcaoAposNota acao) {
		this.acoesAposNota.add(acao);
		return this;
	}
	
}
