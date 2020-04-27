package br.com.main;

import br.com.beans.NotaFiscal;
import br.com.builders.ItemNotaBuilder;
import br.com.builders.NotaFiscalBuilder;

public class RunnerItem {
	public static void main(String[] args) {
		
		NotaFiscalBuilder builderNf = new NotaFiscalBuilder();
		ItemNotaBuilder builderItem = new ItemNotaBuilder();
		
		
		builderNf.paraEmpresa("Wrong Company")
		.comCnpj("00.000.000/0001-10")
		.comItem(builderItem.comNome("Item 1").comValor(200.0).build())
		.comItem(builderItem.comNome("Item 2").comValor(300.0).build())
		.comItem(builderItem.comNome("Item 3").comValor(400.0).build())
		.naDataAtual();
		
		NotaFiscal nf = builderNf.build();
		
		System.out.println(nf.getValorBruto());
	}
}
