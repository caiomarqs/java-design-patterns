package aula2;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {
	
	public void tocar(List<Nota> musica) {
		Player player = new Player();
		
		StringBuilder musicasNotas = new StringBuilder();
		
		for(Nota nota: musica) {
			musicasNotas.append(nota.getSimbolo() + " ");
		}
		
		System.out.println(musicasNotas.toString());
		
		player.play(musicasNotas.toString());
	}
}
