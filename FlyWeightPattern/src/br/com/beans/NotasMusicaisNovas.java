package br.com.beans;

import java.util.HashMap;
import java.util.Map;

import br.com.classes.Do;
import br.com.classes.Fa;
import br.com.classes.La;
import br.com.classes.Mi;
import br.com.classes.Nota;
import br.com.classes.Re;
import br.com.classes.Si;
import br.com.classes.Sol;

public class NotasMusicaisNovas {
private static Map<String, Nota> NOTAS = new HashMap<String, Nota>();
	
	//Construtor estatico, é carregado um vez só quando a JVM carrega a classe
	static {
		NOTAS.put("do", new Do());
		NOTAS.put("do#", new DoS());
		NOTAS.put("re", new Re());
		NOTAS.put("re#", new ReS());
		NOTAS.put("mi", new Mi());
		NOTAS.put("fa", new Fa());
		NOTAS.put("fa#", new FaS());
		NOTAS.put("sol", new Sol());
		NOTAS.put("sol#", new SolS());
		NOTAS.put("la", new La());
		NOTAS.put("la#", new LaS());
		NOTAS.put("si", new Si());
	}
	
	public Nota getNota(String nome) {
		return NOTAS.get(nome);
	}
}
