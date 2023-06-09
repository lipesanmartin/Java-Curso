package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char isOutsourced = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = Integer.parseInt(sc.nextLine());
			System.out.print("Value per hour: ");
			double valuePerHour = Double.parseDouble(sc.nextLine());
			if (isOutsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = Double.parseDouble(sc.nextLine());
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(employee);
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}

		}
		System.out.println("\nPAYMENTS:");
		for (Employee e : employees) {
			System.out.println(e);
		}

		sc.close();
	}

}
