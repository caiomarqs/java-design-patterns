import java.util.List;

public abstract class TemplateRelatorio implements Relatorio{

	@Override
	public final void imprimeRelatorio(Banco banco) {
		cabecalho(banco);
		corpo(banco.getContas());
		rodape(banco);
	}

	protected abstract void cabecalho(Banco banco);

	protected abstract void corpo(List<Conta> contas);

	protected abstract void rodape(Banco banco);

}
