package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();
		System.out.print("Enter the number of shapes: ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = sc.nextLine().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.nextLine());

			if (type == 'r') {
				System.out.print("Width: ");
				double width = Double.parseDouble(sc.nextLine());
				System.out.print("Height: ");
				double height = Double.parseDouble(sc.nextLine());
				shapes.add(new Rectangle(color, width, height));
			} else if (type == 'c') {
				System.out.print("Radius: ");
				double radius = Double.parseDouble(sc.nextLine());
				shapes.add(new Circle(color, radius));
			}
		}
		System.out.println("\nSHAPE AREAS:");
		
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();
	}

}
