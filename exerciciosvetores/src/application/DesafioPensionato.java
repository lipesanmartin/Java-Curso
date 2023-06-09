package application;

import java.util.Scanner;

import entities.Student;

public class DesafioPensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] pensao = new Student[10];
		System.out.print("How many rooms will be rented? ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println();
		//System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:\n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = Integer.parseInt(sc.nextLine()); 
			pensao[room] = new Student(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < pensao.length; i++) {
			if (pensao[i] instanceof Student) {
				System.out.printf("%d: %s\n", i, pensao[i].toString());
			}
		}
		
		
		sc.close();
		
	}

}
