import java.util.List;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected void cabecalho(Banco banco) {
		System.out.println(banco.getNomeBanco());

	}

	@Override
	protected void corpo(List<Conta> contas) {
		System.out.println("__________________________________________________");
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
		System.out.println("__________________________________________________");
	}

	@Override
	protected void rodape(Banco banco) {
		System.out.println(banco.getTelefone());
	}

}
