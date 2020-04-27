package br.com.main;

import br.com.beans.ItemNota;
import br.com.beans.NotaFiscal;
import br.com.builders.NotaFiscalBuilder;

public class RunnerNf {
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Wrong Company")
		.comCnpj("00.000.000/0001-10")
		.comItem(new ItemNota("Item 1", 200.0))
		.comItem(new ItemNota("Item 2", 300.0))
		.comItem(new ItemNota("Item 3", 400.0))
		.naDataAtual();
		
		NotaFiscal nf = builder.build();
		
		System.out.println(nf.getValorBruto());
	}
}
