
public class Aprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor = orcamento.valor - (orcamento.valor * 0.02);
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento já está APROVADO");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Um orçamento APROVADO não pode ser REPROVADO");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoOrcamento = new Finalizado();
	}

}
