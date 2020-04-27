
public class mainDescontos {
	 public static void main(String[] args) {
		//Chain of Responsability
		 
		//Essa classe contem todo o encadeamento de descontos
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.addItem(new Item("Lapis", 250.0));
		orcamento.addItem(new Item("Caneta", 250.0));
		orcamento.addItem(new Item("borracha", 15.00));
		
		double descontoFinal = descontos.calculaDesconto(orcamento);
		
		System.out.println(descontoFinal);
		
	}
}
