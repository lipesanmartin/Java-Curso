package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for Course A? ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(sc.nextLine()));
		}
		System.out.print("How many students for Course B? ");
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			b.add(Integer.parseInt(sc.nextLine()));
		}
		System.out.print("How many students for Course C? ");
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			c.add(Integer.parseInt(sc.nextLine()));
		}
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
		
	}

}
