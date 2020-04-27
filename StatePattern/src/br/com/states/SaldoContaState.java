package br.com.states;

import br.com.beans.Conta;

public interface SaldoContaState {
	
	void sacar(Conta conta, double valor);
	void depositar(Conta conta, double valor);
	
}
