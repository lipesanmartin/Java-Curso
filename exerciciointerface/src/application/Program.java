package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre os dados do contrato");
		System.out.print("Numero: ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = Double.parseDouble(sc.nextLine());

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int n = Integer.parseInt(sc.nextLine());

		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, n);

		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallment()) {
			System.out.println(installment);
		}

		sc.close();

	}

}
