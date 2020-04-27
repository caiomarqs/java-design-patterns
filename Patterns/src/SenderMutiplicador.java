
public class SenderMutiplicador implements AcaoAposNota {

	private double valorMutiplicador;


	public SenderMutiplicador(double valorMutiplicador) {
		this.valorMutiplicador = valorMutiplicador;
	}
	
	
	@Override
	public void executar(NotaFiscal nf) {
		double valorNota = nf.getValorBruto();
		double valorMultiplicado = valorNota * valorMutiplicador;
		System.out.println("O valor da nota multiplicado por [ "+valorMutiplicador+" ] é de [ "+valorMultiplicado+" ]");
	}

}
