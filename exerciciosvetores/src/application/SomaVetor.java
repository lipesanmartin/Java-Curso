package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = Integer.parseInt(sc.nextLine());
		double[] numbers = new double[n];

		for (int i = 0; i < n; i++) {
			while (true) {
				System.out.print("Digite um numero: ");
				double input = Double.parseDouble(sc.nextLine());
				if (input < 0) {
					System.out.println("Numero precisa ser positivo");
				} else {
					numbers[i] = input;
					break;
				}
			}
		}

		System.out.print("VALORES = ");
		double sum = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%.1f  ", numbers[i]);
			sum += numbers[i];
		}
		double avg = sum / numbers.length;
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);

		sc.close();
	}

}
