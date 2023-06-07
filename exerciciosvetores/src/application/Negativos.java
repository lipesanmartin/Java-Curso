package application;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.print("Quantos números você vai digitar? ");
			n = Integer.parseInt(sc.nextLine());
			if (n < 1 || n > 10) {
				System.out.println("Intervalo deve ser entre 1 e 10.");
			} else {
				break;
			}
		}
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		sc.close();

	}

}
