package br.com.observers;

import br.com.beans.NotaFiscal;

public class SenderSMS implements AcaoAposNota{
	public void executar(NotaFiscal nf) {
		System.out.println("Enviou SMS");
	}
}
