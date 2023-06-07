package application;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, quantPares = 0;
		int[] numeros;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				quantPares += 1;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Quantidade de pares = " + quantPares);

		sc.close();

	}

}
