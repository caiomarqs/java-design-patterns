package br.com.main;

import br.com.bridge.GoogleMaps;
import br.com.bridge.Mapa;

public class Runner {
	
	public static void main(String[] args) {
		
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua leao");
		
	}

}
