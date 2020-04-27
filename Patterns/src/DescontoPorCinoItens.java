
public class DescontoPorCinoItens implements Desconto{

	private Desconto proximo;

	@Override
	public double descontoItem(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return proximo.descontoItem(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;	
	}
}
