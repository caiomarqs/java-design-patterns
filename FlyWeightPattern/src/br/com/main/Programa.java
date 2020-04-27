package br.com.main;

import java.util.Arrays;
import java.util.List;

//import br.com.beans.NotasMusicais;
import br.com.beans.NotasMusicaisNovas;
import br.com.beans.Piano;
import br.com.classes.Nota;

public class Programa {
	public static void main(String[] args) {
		
		NotasMusicaisNovas notas = new NotasMusicaisNovas();
		
		
		List<Nota> musica = Arrays.asList(
					notas.getNota("do"),
					notas.getNota("re"),
					notas.getNota("mi"),
					notas.getNota("fa"),
					notas.getNota("fa"),
					notas.getNota("fa"),
					notas.getNota("do"),
					notas.getNota("re"),
					notas.getNota("do#"),
					notas.getNota("re"),
					notas.getNota("re"),
					notas.getNota("re"),
					notas.getNota("do"),
					notas.getNota("sol#"),
					notas.getNota("fa"),
					notas.getNota("mi"),
					notas.getNota("mi"),
					notas.getNota("mi")
				);
		
		//Observando as instancias as de _fa_ são as mesmas
		//System.out.println(musicas);
		
		for (int i = 0; i < 7; i++) {
			Piano piano = new Piano();
			piano.tocar(musica);
		}

	}
}
