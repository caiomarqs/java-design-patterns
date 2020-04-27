package aula2;

import java.util.Arrays;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
		
		
		List<Nota> musica = Arrays.asList(
					notas.getNota("do"),
					notas.getNota("re"),
					notas.getNota("mi"),
					notas.getNota("fa"),
					notas.getNota("fa"),
					notas.getNota("fa")
				);
		
		//Observando as instancias as de _fa_ são as mesmas
//		System.out.println(musicas);
		
		Piano piano = new Piano();
		piano.tocar(musica);
	}
}
