
public class RespostaXML implements Resposta {

	private Resposta resposta;

	@Override
	public String responde(Requisicao req, Conta conta){
		if(req.getFormato() == Formato.XML) {
			return 			"<conta>"
						     +  "<titular>"
						     +   conta.getTitular()
						     +  "</titular>"
						     +  "<saldo>"
						     +   conta.getSaldo()
						     +  "</saldo>"
							 + "</conta>";
		}
		else {
			try {
				return resposta.responde(req, conta);
			} catch (Exception e) {
				throw new RuntimeException("Formato de resposta não encontrado");
			}
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
