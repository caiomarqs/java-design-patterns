package aula4e5;

public class Soma implements Expressao {
	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		
		return (valorDaEsquerda + valorDaDireita);
	}
	
	public Expressao getDireita() {
		return direita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}

	@Override
	public void aceita(ImpressoraVisitor imporessora) {
		imporessora.visitaSoma(this);
	}
}
