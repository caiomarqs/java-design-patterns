package aula7;

public class PagaPedidoCommand implements Comando{

	private Pedido p;

	public PagaPedidoCommand(Pedido p ) {
		this.p = p;
	}
	
	@Override
	public void executa() {
		System.out.println("Pagando pedido do: " + this.p.getCliente());
		
		p.paga();
	}

}
