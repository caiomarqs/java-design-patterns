import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	private final List<Item> itens;
	
	protected EstadoOrcamento estadoOrcamento;
	
	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoOrcamento = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoOrcamento.aplicaDescontoExtra(this);
	}
	
	public void aprovar() {
		estadoOrcamento.aprovar(this);
	}
	
	public void reprovar() {
		estadoOrcamento.reprovar(this);
	}
	
	public void finalizar() {
		estadoOrcamento.finalizar(this);
	}
}
