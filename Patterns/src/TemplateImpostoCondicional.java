
public abstract class TemplateImpostoCondicional implements Imposto {

	public double calculaImposto(Orcamento orcamento) {
		if (usaMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean usaMaximaTaxacao(Orcamento orcamento);
	
}
