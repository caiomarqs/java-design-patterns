package aula6;

import java.util.Calendar;

public class RelogioSistema implements Relogio {

	@Override
	public Calendar getHoje() {
		return Calendar.getInstance();
	}

}
