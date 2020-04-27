package br.com.observers;

import br.com.beans.NotaFiscal;

public class SenderEmail implements AcaoAposNota {
	public void executar(NotaFiscal nf) {
		System.out.println("Enviou email");
	}
}
