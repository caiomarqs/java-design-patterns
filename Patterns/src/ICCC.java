
public class ICCC implements Imposto{

	@Override
	public double calculaImposto(Orcamento orcamento) {
		double orcamentoValor = orcamento.getValor();
		
		if(orcamentoValor < 1000.0) {
			return orcamentoValor * 0.05;
		}
		else if(orcamentoValor > 1000.0 && orcamentoValor <= 3000.0) {
			return orcamentoValor * 0.05;
		}
		else if(orcamentoValor > 3000.0) {
			return (orcamentoValor * 0.08) + 30.0;
		}
		return 0;
	}
	
}
