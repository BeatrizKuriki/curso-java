package entities;

public class conta {
	private int numeroConta;
	private String titular;	
	private double saldo;
	
	
	public conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}


	public conta(int numeroConta, String titular, double depositoInicial) {
		
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(depositoInicial);
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void deposito(double valor) {
		saldo +=valor;
	}
	
	public void sacar(double valor) {
		saldo -=valor + 5.0;
	}
	
	public String toString() {
		return "CONTA "
				+ numeroConta
				+", TITULAR:"
				+ titular
				+", SALDO: R$"
				+ String.format("%.2f", saldo);
	}

	
	

}
