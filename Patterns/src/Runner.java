
public class Runner {
	
	public static void main(String[] args) {
		
		//Instanciandos os objetos com o mesmo contrato
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		//Definindo o orcamento
		Orcamento orcamento = new Orcamento(50.0);
		
		//Chamando a calculadora
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		//esse metodo recebe o obj orcamento, e os objetos com o mesmo contrato
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iss);
		
	}

}
