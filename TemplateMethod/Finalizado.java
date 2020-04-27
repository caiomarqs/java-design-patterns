
public class Finalizado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem descontos extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento já está FINALIZADO");
		
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento já está FINALIZADO");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento já está FINALIZADO");
		
	}
	
}
