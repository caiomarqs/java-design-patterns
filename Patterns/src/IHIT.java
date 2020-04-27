import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getItens().size() * 0.01;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100.0;
	}

	@Override
	protected boolean usaMaximaTaxacao(Orcamento orcamento) {
		return temDoisItemsComMesmoNome(orcamento);
	}

	private boolean temDoisItemsComMesmoNome(Orcamento orcamento) {
		List<String> itemNoOrcamento = new ArrayList<String>();

		for (Item item : orcamento.getItens()) {
			if (itemNoOrcamento.contains(item.getNome())) {
				return true;
			} 
			else {
				itemNoOrcamento.add(item.getNome());
			}
		}
		return false;
	}

}
