package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char indOrComp = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = Double.parseDouble(sc.nextLine());
			if (indOrComp == 'i') {
				System.out.print("Health expenditures: ");
				double healthExp = Double.parseDouble(sc.nextLine());
				taxPayers.add(new Individual(name, anualIncome, healthExp));
			}
			if (indOrComp == 'c') {
				System.out.print("Number of employees: ");
				int numOfEmp = Integer.parseInt(sc.nextLine());
				taxPayers.add(new Company(name, anualIncome, numOfEmp));
			}

		}
		System.out.println("\nTAXES PAID:");
		double totalTaxes = 0;
		for (TaxPayer tp : taxPayers) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
			totalTaxes += tp.tax();
		}
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		sc.close();
	}

}
