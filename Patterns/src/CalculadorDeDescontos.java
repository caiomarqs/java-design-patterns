
public class CalculadorDeDescontos {
	public double calculaDesconto(Orcamento orcamento) {
		//Um desconto chama o outro até chamar o desconto final que seria a execessao
		Desconto d1 = new DescontoPorCinoItens();
		Desconto d2 = new DescontoPorMaisQuientosReais();
		Desconto d3 = new DescontoVendaCasada();
		Desconto dFinal = new SemDesconto();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(dFinal);

		return d1.descontoItem(orcamento);
	}
}
