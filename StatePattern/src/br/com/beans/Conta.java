package br.com.beans;

import br.com.states.Positivo;
import br.com.states.SaldoContaState;

public class Conta {
	
	private double saldo;

	private SaldoContaState saldoContaState;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(double saldo) {
		this.saldo = saldo;
		this.saldoContaState = new Positivo();
	}

	public void sacar(double valor) {
		saldoContaState.sacar(this, valor);
	}
	
	public void depositar(double valor) {
		saldoContaState.depositar(this, valor);
	}

	public void setState(SaldoContaState saldoContaState) {
		this.saldoContaState = saldoContaState;
		
	}
	
		
	
}
