package entities;

public class Conta {
	private int number;
	private String holder;
	private double balance;

	public Conta(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getName() {
		return holder;
	}

	public void setName(String nome) {
		this.holder = nome;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return String.format("Account %d, Holder %s, Balance: $ %.2f", number, holder, balance);
	}

	public void withdrawn(double valor) {
		balance = (balance - valor) - 5;
	}
	
	public void deposit(double valor) {
		balance += valor;
	}
}
