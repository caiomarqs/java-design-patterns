package br.com.main;

import java.util.Calendar;

import br.com.beans.Contrato;
import br.com.beans.TipoContrato;
import br.com.memento.Estado;
import br.com.memento.Historico;

public class Runner {

	public static void main(String[] args) {
		Historico historico = new Historico();
		
		Contrato c1 = new Contrato(Calendar.getInstance(), "Jose", TipoContrato.NOVO); //- 0
		//Salvando o estado do historico --> o medo salva estado salva o estado atual
		historico.adiciona(c1.salvaEstado());
		
		//Avancando com o estado do contrato
		c1.avanca();// - 1
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();// - 2
		historico.adiciona(c1.salvaEstado());
		
		Estado estadoAnterior = historico.pega(0); // percorre entre os estados avancados
		System.out.println(estadoAnterior.getEstado().getTipo());
	}
}
