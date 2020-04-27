
public class Finalizado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem descontos extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento j� est� FINALIZADO");
		
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento j� est� FINALIZADO");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento j� est� FINALIZADO");
		
	}
	
}
