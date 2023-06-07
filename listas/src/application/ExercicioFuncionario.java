package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class ExercicioFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = Integer.parseInt(sc.nextLine());

		List<Employee> listEmployees = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d:\n", i + 1);
			System.out.print("Id: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			listEmployees.add(new Employee(id, name, salary));

		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int increase = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the percentage: ");
		double percentage = Double.parseDouble(sc.nextLine());

		System.out.println();
		for (Employee employee : listEmployees) {
			if (employee.getId() == increase) {
				employee.increaseSalary(percentage);;
			}
		}

		System.out.println("List of employees:");

		for (Employee employee : listEmployees) {
			System.out.print(employee.toString());
		}

		sc.close();

	}

}
