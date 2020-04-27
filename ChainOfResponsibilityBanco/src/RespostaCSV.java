
public class RespostaCSV implements Resposta{
	
	private Resposta resposta;

	@Override
	public String responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			return conta.getTitular() +  "," + conta.getSaldo();
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
