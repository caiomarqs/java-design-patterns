package br.com.beans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.classes.Do;
import br.com.classes.Fa;
import br.com.classes.La;
import br.com.classes.Mi;
import br.com.classes.Nota;
import br.com.classes.Re;
import br.com.classes.Si;
import br.com.classes.Sol;

//Esta classe tem uma abstracao com a API refletion do java, e verifica se a classe foi instanciada ou n, 
//mas instancia a classe só REALMENTE se precisar, por isso não se instancia as classes no construtor estatico
public class NotasMusicasRefletion {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	private static List<Class<? extends Nota>> clazzes;

	static {
		clazzes = Arrays.asList(Do.class, Re.class, Mi.class, Fa.class, Sol.class, La.class, Si.class);
	}

	public Nota getNota(String nome) {
		try {
			
			//verifica se exite a chave com o nome desejado no Array de Notas
			if (!notas.containsKey(nome)) {
				
				//Verifica se existe a classe para ser instanciada no construtor estatico
				for (Class<? extends Nota> clazz : clazzes) {
					if (clazz.getSimpleName().toLowerCase().equals(nome)) {

						notas.put(nome, (Nota) clazz.newInstance());
					}
				}
				
				
			}
			
			return notas.get(nome);
		} catch (Exception e) {
			throw new RuntimeException("Não existe a classe que deseja instanciar");
		}

	}

}
