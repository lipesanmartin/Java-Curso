package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno(dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(model));
		System.out.print("Entre com o pre�o por hora: ");
		double pricePerHour = Double.parseDouble(sc.nextLine());
		System.out.print("Entre com o pre�o por dia: ");
		double pricePerDay = Double.parseDouble(sc.nextLine());

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(cr);
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("TOTAL: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		sc.close();

	}

}
