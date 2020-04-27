package aula4e5;

public class ImpressoraVisitor {
	
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		
		soma.getEsquerda().aceita(this);
		
		System.out.print("+");
		
		soma.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaSubracao(Subtracao subtracao) {
		System.out.print("(");
		
		subtracao.getEsquerda().aceita(this);
		
		System.out.print("-");
		
		subtracao.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaNumero(Numero numero) {		
		System.out.print(numero.getNumero());
	}
}
