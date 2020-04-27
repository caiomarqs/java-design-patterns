package br.com.runner;

import br.com.beans.Conta;

public class RunnerConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta(-200);
		
		conta.depositar(210);
		
		conta.sacar(30.0);
		
		conta.sacar(300);
		
		conta.sacar(10);
	}

}
