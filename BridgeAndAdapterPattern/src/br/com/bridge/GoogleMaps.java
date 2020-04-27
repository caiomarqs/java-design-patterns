package br.com.bridge;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {

		try {
			
			//-> Exemplo de implementacao de algo externo que retorna algum dado(ex: API's)
			
			String googleMaps = "http://maps.google.com.br/maps?q=rua+leao";
			URL url = new URL(googleMaps);
			@SuppressWarnings("unused")
			InputStream openStram = url.openStream();
			//....
			return "Rua Leao"; 
			
		} 
		catch (MalformedURLException e1) {
			e1.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
