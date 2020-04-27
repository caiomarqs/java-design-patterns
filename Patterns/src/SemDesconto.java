
public class SemDesconto implements Desconto{

	@Override
	public double descontoItem(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {}

}
