import java.util.GregorianCalendar;

public class RunnerNotalFiscal {
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
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
