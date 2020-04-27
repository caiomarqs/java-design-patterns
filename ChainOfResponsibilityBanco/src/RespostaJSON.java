
public class RespostaJSON implements Resposta{

	private Resposta resposta;

	@Override
	public String responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.JSON) {
			return "{conta:"
						     +  "{\"titular\": \""
						     +   conta.getTitular()
						     +  "\","
						     +  "\"saldo\":"
						     +   conta.getSaldo()
						     +  "}"
							 + "}";
		}
		else {
			return resposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
