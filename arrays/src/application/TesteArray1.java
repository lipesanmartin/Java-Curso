package application;

import java.util.Scanner;

public class TesteArray1 {

	public static void main(String[] args) {
		System.out.print("Selecione o tamanho do vetor: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n]; // cria o vetor
		for (int i = 0; i < n; i++) {
			System.out.print("Num: ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("AVG = %.2f%n", avg);
		sc.close();
		
	}

}
