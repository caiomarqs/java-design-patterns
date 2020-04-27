
public class Runner {
	public static void main(String[] args) {
		GerenciadorRequisicao gRequisicao = new GerenciadorRequisicao();
		
		Conta contaCaio = new Conta("Caio Vincius Marques", 200.0);
		
		Requisicao req = new Requisicao(Formato.JSON);
		
		System.out.println(gRequisicao.fazerRequisicao(req, contaCaio));
	}
}
