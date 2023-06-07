package application;

import java.util.Scanner;

import entities.Product;

public class TesteArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			String name = sc.nextLine();
			double price = Double.parseDouble(sc.nextLine());
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVG PRICE = %.2f%n", avg);
		sc.close();
	}

}
