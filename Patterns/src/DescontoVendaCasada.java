import java.util.List;

public class DescontoVendaCasada implements Desconto {

	private Desconto proximo;
	List<Item> itens;
	
	@Override
	public double descontoItem(Orcamento orcamento) {
		
		this.itens = orcamento.getItens();
		
		if (contemItemDeNome("Lapis") && contemItemDeNome("Caneta")) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.descontoItem(orcamento);
		}
		
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;		
	}
	
	//Verifica se tem o item conforme o passdo
	public boolean contemItemDeNome(String nomeDoItem) {
		
		for(Item item: itens) {
			if (item.getNome().equals(nomeDoItem)) {
				return true;
			}
		}
		
		return false;
	}
}
