package application;

import java.util.Scanner;

import entities.Person;

public class Alturas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = Integer.parseInt(sc.nextLine());
		Person[] people = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("Altura: ");
			double height = Double.parseDouble(sc.nextLine());
			people[i] = new Person(name, age, height);
		}

		double heightSum = 0;
		int youngerThan16 = 0;

		for (int i = 0; i < people.length; i++) {
			heightSum += people[i].getHeight();
			if (people[i].getAge() < 16) {
				youngerThan16 += 1;
			}
		}
		double avgHeight = heightSum / people.length;
		double percentage = ((double) youngerThan16 / people.length) * 100.0;

		System.out.println();
		System.out.printf("Altura media: %.2f%n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}

		sc.close();

	}

}
