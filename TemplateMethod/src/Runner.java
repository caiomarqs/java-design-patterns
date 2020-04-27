
public class Runner {

//	private static TipoRelatorio TESTE;

	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco BBC", "Avenida String", "(11) 4002-8922", "sac@bancobbc.com.br");
		
		banco.addConta(new Conta("Jose Pereira da Silva", 002, 1452, 1000.0));
		banco.addConta(new Conta("Italo Santos", 004, 1789, 1589.0));
		banco.addConta(new Conta("Adalylton Laerte Chagas", 458, 4588, 14878.0));
		banco.addConta(new Conta("Alex King Silva", 455, 7859, 12569.0));

		ImpresoraRelatorio impressora = new ImpresoraRelatorio();
		impressora.imprimindoRelatorio(banco, TipoRelatorio.SIMPLES);
	}
}
