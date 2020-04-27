package br.com.observers;

import br.com.beans.NotaFiscal;

public class SenderImpressora implements AcaoAposNota {
	public void executar(NotaFiscal nf) {
		System.out.println("Arquivo Impresso");
	}
}
