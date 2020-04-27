
public class EmAprovacao implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor = orcamento.valor - (orcamento.valor * 0.05);
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.estadoOrcamento = new Aprovado();
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.estadoOrcamento = new Reprovado();
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Um orçamento EM_APROVAÇÃO não pode ser FINAIZADO diretamente");
	}

}
