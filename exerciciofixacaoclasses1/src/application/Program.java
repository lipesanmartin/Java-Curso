package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta conta;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		double initialDeposit;
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			conta = new Conta(number, name, initialDeposit);
		} else {
			conta = new Conta(number, name);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta.toString());
		System.out.println();
		System.out.print("Enter a deposit value: ");
		conta.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		conta.withdrawn(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		sc.close();
	}

}
