package br.com.states;

import br.com.beans.Conta;

public class Negativo implements SaldoContaState {

	@Override
	public void sacar(Conta conta, double valor) {
		throw new RuntimeException("Contas negativadas não podem sacar");
	}

	@Override
	public void depositar(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.95));
		System.out.println("Foi descontado: [" + (valor - (valor * 0.95)) + "] do valor do deposito");
		System.out.println("Saldo atual: [" + conta.getSaldo() + "]");
	}
}
