
public class ImpresoraRelatorio {
	public void imprimindoRelatorio(Banco banco, TipoRelatorio tipo) {

		if (tipo == TipoRelatorio.SIMPLES) {
			RelatorioSimples relSimples = new RelatorioSimples();
			relSimples.imprimeRelatorio(banco);
		} else if (tipo == TipoRelatorio.COMPLEXO) {
			RelatorioComplexo relComplexo = new RelatorioComplexo();
			relComplexo.imprimeRelatorio(banco);
		} else {
			System.out.println("Tipo do relatorio invalido");
		}

	}

}
