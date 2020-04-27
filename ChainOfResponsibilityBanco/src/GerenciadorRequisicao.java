
public class GerenciadorRequisicao {
	public String fazerRequisicao(Requisicao req, Conta conta) {
		Resposta res1 = new RespostaCSV();
		Resposta res2 = new RespostaXML();
		Resposta res3 = new RespostaJSON();
		Resposta resFinal = new RespostaNull();
		
		res1.setProxima(res2);
		res2.setProxima(res3);
		res3.setProxima(resFinal);
		
		return res1.responde(req, conta);
	}
}
