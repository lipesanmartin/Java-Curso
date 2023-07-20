package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); // hashset mais indicado quando a ordem não importa
		// Set<String> set = new TreeSet<>(); ordena os elementos
		// Set<String> set = new LinkedHashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));
		set.removeIf(x -> x.length() >= 3);

		for (String p : set) {
			System.out.println(p);
		}
	}

}
