package br.com.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	//A classe historico é responsavel por guardar em memoria os Estados dos contratos
	
	private List<Estado> estadosSalvos = new ArrayList<Estado>();

	public Estado pega(int index) {
		return estadosSalvos.get(index);
	}

	public void adiciona(Estado estado) {
		estadosSalvos.add(estado);
	}
	
}
