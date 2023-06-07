package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported? (c/u/i) ");
			char type = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = Double.parseDouble(sc.nextLine());
			if (type == 'c') {
				products.add(new Product(name, price));
			} else if (type == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = Double.parseDouble(sc.nextLine());
				products.add(new ImportedProduct(name, price, customsFee));
			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
				products.add(new UsedProduct(name, price, date));

			}

		}

		System.out.println("\nPRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}
