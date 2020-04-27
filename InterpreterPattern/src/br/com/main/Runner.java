package br.com.main;

import br.com.beans.Divisao;
import br.com.beans.Expressao;
import br.com.beans.Multiplicacao;
import br.com.beans.Numero;
import br.com.beans.RaizQuadrada;
import br.com.beans.Soma;
import br.com.beans.Subtracao;

public class Runner {
	public static void main(String[] args) {
		Expressao entradaDireita = new Soma(new Numero(30), new Numero(30));
		Expressao entradaEsquerda = new Subtracao(new Numero(30), new Numero(20));
		
		Expressao somaFinal = new Soma(entradaDireita, entradaEsquerda);
		
		int resultadoSoma = somaFinal.avalia();//->> esse avalia cham em cadeia o valaria das expressoes acima

		System.out.println(resultadoSoma);
		
		
		Expressao multDireita = new Soma(new Numero(10), new Numero(20));
		Expressao multEsquerda = new Divisao(new Numero(10), new Numero(2));
		
		int resultadoMult = new Multiplicacao(multDireita,multEsquerda).avalia();
		
		System.out.println(resultadoMult);
		
		Expressao raizquadrada = new RaizQuadrada(new Numero(4));
		System.out.println(raizquadrada.avalia());
		
	}
}
