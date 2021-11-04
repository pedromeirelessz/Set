package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		// No repetitions allowed
		// Elements have no position
		// Accessing, inserting and removing elements is fast
		// Offers efficient set operations: intersection, union, difference.
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// Main implementations.
		// Does not arrange in order
		Set<?> speedy = new HashSet<>();

		// Organization of the order of compareTO
		Set<?> slow = new TreeSet<>();
		// Arrange in the order they were placed
		Set<?> intermediary = new LinkedHashSet<>();

		// examples:
		// union = 0, 2, 4, 5, 6, 7, 8, 9, 10
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		// intersection = 5, 6, 8, 10
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		// difference = 0, 2, 4
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}
}