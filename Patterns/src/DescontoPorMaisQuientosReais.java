
public class DescontoPorMaisQuientosReais implements Desconto {

	private Desconto proximo;

	@Override
	public double descontoItem(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximo.descontoItem(orcamento);
		}
	}
	
	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;	
	}
	
}
