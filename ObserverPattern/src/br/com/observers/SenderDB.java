package br.com.observers;

import br.com.beans.NotaFiscal;

public class SenderDB implements AcaoAposNota{
	public void executar(NotaFiscal nf) {
		System.out.println("Salvou no banco");
	}
}
