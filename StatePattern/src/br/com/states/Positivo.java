package br.com.states;

import br.com.beans.Conta;

public class Positivo implements SaldoContaState {

	@Override
	public void sacar(Conta conta, double valor) {
		
		if (conta.getSaldo() < 0) {
			conta.setState(new Negativo());
			return;
		}
		
		conta.setSaldo(conta.getSaldo() - valor);
		System.out.println("Saque de: [" + valor + "] efetuado");
		System.out.println("Saldo atual: [" + conta.getSaldo() + "]");
	}

	@Override
	public void depositar(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.98));
		System.out.println("Foi descontado: [" + (valor - (valor * 0.98)) + "] do valor do deposito");
		System.out.println("Saldo atual: [" + conta.getSaldo() + "]");
	}

}
