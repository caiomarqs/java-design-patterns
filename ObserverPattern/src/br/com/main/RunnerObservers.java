package br.com.main;

import java.util.GregorianCalendar;

import br.com.beans.ItemNota;
import br.com.beans.NotaFiscal;
import br.com.builders.NotaFiscalBuilder;
import br.com.observers.SenderDB;
import br.com.observers.SenderEmail;
import br.com.observers.SenderImpressora;
import br.com.observers.SenderMutiplicador;
import br.com.observers.SenderSMS;

public class RunnerObservers {
	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		//observer tem que ser chamdo antes, pois � no build que ele chama essas instancias de fato
		builder.adicionarAcao(new SenderDB())
		.adicionarAcao(new SenderEmail())
		.adicionarAcao(new SenderImpressora())
		.adicionarAcao(new SenderSMS())
		.adicionarAcao(new SenderMutiplicador(2));
		
		builder.paraEmpresa("Wrong Company")
		.comCnpj("00.000.000/0001-10")
		.comItem(new ItemNota("Item 1", 200.0))
		.comItem(new ItemNota("Item 2", 300.0))
		.comItem(new ItemNota("Item 3", 400.0))
		.naData(new GregorianCalendar(2019,03,12));
		
		NotaFiscal nf = builder.build();
	
		System.out.println(nf.getDataDeEmissao().getTime());
	}
}
