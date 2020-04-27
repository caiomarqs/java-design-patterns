package br.com.adpter;

import java.util.Calendar;

//Implementação do adpter onde encapsulamos as implementções em metodos com objetivos unicos
public class RelogioSistema implements Relogio {

	@Override
	public Calendar getHoje() {
		return Calendar.getInstance();
	}

}
