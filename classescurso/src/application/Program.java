package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre as medidas do triangulo X: ");
		x.a = Double.parseDouble(sc.nextLine());
		x.b = Double.parseDouble(sc.nextLine());
		x.c = Double.parseDouble(sc.nextLine());

		System.out.println("Entre as medidas do triangulo Y: ");
		y.a = Double.parseDouble(sc.nextLine());
		y.b = Double.parseDouble(sc.nextLine());
		y.c = Double.parseDouble(sc.nextLine());

		double areaX = x.calcularArea();
		double areaY = y.calcularArea();

		Locale.setDefault(Locale.US);
		System.out.printf("Area do triangulo X: %.4f%n", areaX); // printf - string formatada
		System.out.printf("Area do triangulo Y: %.4f%n", areaY); // printf - string formatada

		if (areaX > areaY) {
			System.out.println("Triangulo X é maior.");
		} else {
			System.out.println("Triangulo Y é maior.");
		}

		sc.close();
	}

}
