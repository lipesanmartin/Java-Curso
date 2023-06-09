package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		// cria o cliente
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): "); // erro aqui na data de aniversario
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt1);

		Client client = new Client(name, email, birthDate);

		// inicio do pedido

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		System.out.print("How many items to this order? ");
		int n = Integer.parseInt(sc.nextLine());

		Order finalOrder = new Order(LocalDateTime.now(), status, client);

		// cria cada objeto OrderItem e insere na lista de finalOrder
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = Double.parseDouble(sc.nextLine());
			System.out.print("Product quantity: ");
			int prodQuant = Integer.parseInt(sc.nextLine());
			Product product = new Product(prodName, prodPrice);
			finalOrder.addItem(new OrderItem(product, prodQuant));
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(finalOrder.toString());
		
		
		sc.close();

	}

}
