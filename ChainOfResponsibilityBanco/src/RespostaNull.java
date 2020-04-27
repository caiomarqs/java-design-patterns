
public class RespostaNull implements Resposta {

	@Override
	public String responde(Requisicao req, Conta conta) {
		return "Sem resposta pois o formato é invalido";
	}

	@Override
	public void setProxima(Resposta resposta) {
		
	}

}
