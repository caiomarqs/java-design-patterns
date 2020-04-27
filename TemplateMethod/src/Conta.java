
public class Conta {
	
	private String titular;
	private int agencia;
	private int numeroConta;
	private double saldo;

	public Conta(String titular,int agencia,int  numeroConta,double saldo) {
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
}
