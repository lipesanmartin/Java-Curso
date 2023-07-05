package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Exercise {

	public static void main(String[] args) {

		String filePath = "c:\\temp\\arquivo.csv";
		File file = new File(filePath);
		List<Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				String[] info = line.split(",");
				Product product = new Product(info[0], Double.parseDouble(info[1]), Integer.parseInt(info[2]));
				list.add(product);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		boolean success = new File(file.getParent() + "\\out").mkdir();
		System.out.println("Directory created successfully: " + success);
		String newPath = "c:\\temp\\out\\summary.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))) {
			for (Product p : list) {
				bw.write(p.getName() + "," + String.format("%.2f", p.totalPrice()));
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
