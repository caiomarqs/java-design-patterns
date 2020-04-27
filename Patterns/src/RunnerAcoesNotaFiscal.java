import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class RunnerAcoesNotaFiscal {
	public static void main(String[] args) {

		List<AcaoAposNota> listaAcoes = new ArrayList<AcaoAposNota>();
		listaAcoes.add(new SenderDB());
		listaAcoes.add(new SenderEmail());
		listaAcoes.add(new SenderImpressora());
		listaAcoes.add(new SenderSMS());
		listaAcoes.add(new SenderMutiplicador(2));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(listaAcoes);
		
		//observer tem que ser chamdo antes, pois é no build que ele chama essas instancias de fato
//		builder.adicionarAcao(new SenderDB())
//		.adicionarAcao(new SenderEmail())
//		.adicionarAcao(new SenderImpressora())
//		.adicionarAcao(new SenderSMS())
//		.adicionarAcao(new SenderMutiplicador(2));
		
		builder.paraEmpresa("Wrong Company")
		.comCnpj("00.000.000/0001-10")
		.comItem(new ItemNota("Item 1", 200.0))
		.comItem(new ItemNota("Item 2", 300.0))
		.comItem(new ItemNota("Item 3", 400.0))
		.naData(new GregorianCalendar(2019,03,12));
		
		NotaFiscal nf = builder.build();
	
		System.out.println(nf.getDataDeEmissao().getTime());
	}
}
