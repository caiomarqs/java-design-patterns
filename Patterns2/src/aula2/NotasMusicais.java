package aula2;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	
	private static Map<String, Nota> NOTAS = new HashMap<String, Nota>();
	
	//Construtor estatico, é carregado um vez só quando a JVM carrega a classe
	static {
		NOTAS.put("do", new Do());
		NOTAS.put("re", new Re());
		NOTAS.put("mi", new Mi());
		NOTAS.put("fa", new Fa());
		NOTAS.put("sol", new Sol());
		NOTAS.put("la", new La());
		NOTAS.put("si", new Si());
	}
	
	public Nota getNota(String nome) {
		return NOTAS.get(nome);
	}
}
