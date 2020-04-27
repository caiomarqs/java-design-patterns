import java.util.List;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	protected void cabecalho(Banco banco) {
		System.out.println(banco.getNomeBanco());
		System.out.println(banco.getEndereco());
		System.out.println(banco.getTelefone());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		System.out.println("__________________________________________________");
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getNumeroConta() + " - " + conta.getAgencia() + " - "
					+ conta.getSaldo());
		}
		System.out.println("__________________________________________________");
	}

	@Override
	protected void rodape(Banco banco) {
		System.out.println(banco.getEmail());
		System.out.println(banco.getDataAtual());
	}

}
