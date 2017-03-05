package Task;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, eter some text: ");
		String text = sc.nextLine();
		text = text.toUpperCase();
		
		HashMap <Character, Integer> countLetter = new HashMap();
		for (int i = 0; i < text.length(); i++) {
			int count = 1;
			if (!(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')) {
				continue;
			}
			if (countLetter.containsKey(text.charAt(i))) {
				count = countLetter.get(text.charAt(i)) + 1;
			}
			countLetter.put(text.charAt(i), count);
		}
		System.out.println(countLetter);
		System.out.println("-----------");
	
		ComparatorByBroi p = new ComparatorByBroi();
		TreeMap <Integer, Character> sortLetters = new TreeMap<>(p);
		int sum = 0;
		for (Map.Entry<Character, Integer> e : countLetter.entrySet()) {
			sortLetters.put(e.getValue(), e.getKey());
			sum +=e.getValue();
		}
		
		for (Map.Entry<Integer, Character> e : sortLetters.entrySet()) {
			System.out.print(e.getValue() + ": " + e.getKey() + " ");
			int countDies = ((e.getKey()*100) / sum) / e.getKey() ;
			for (int i = 0; i < countDies*e.getKey(); i++) {
				if (i >= 20) {
					break;
				}
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
}
