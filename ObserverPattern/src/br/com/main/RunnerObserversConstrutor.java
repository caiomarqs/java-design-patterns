package br.com.main;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.beans.ItemNota;
import br.com.beans.NotaFiscal;
import br.com.builders.NotaFiscalBuilder;
import br.com.observers.AcaoAposNota;
import br.com.observers.SenderDB;
import br.com.observers.SenderEmail;
import br.com.observers.SenderImpressora;
import br.com.observers.SenderMutiplicador;
import br.com.observers.SenderSMS;

public class RunnerObserversConstrutor {
	public static void main(String[] args) {

		List<AcaoAposNota> listaAcoes = new ArrayList<AcaoAposNota>();
		listaAcoes.add(new SenderDB());
		listaAcoes.add(new SenderEmail());
		listaAcoes.add(new SenderImpressora());
		listaAcoes.add(new SenderSMS());
		listaAcoes.add(new SenderMutiplicador(2));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(listaAcoes);
				
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
