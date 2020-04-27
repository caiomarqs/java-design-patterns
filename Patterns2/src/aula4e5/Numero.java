package aula4e5;

public class Numero implements Expressao {
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return this.numero;
	}
	
	public int getNumero(){
		return this.numero;
	}

	@Override
	public void aceita(ImpressoraVisitor imporessora) {
		imporessora.visitaNumero(this);
	}
}
