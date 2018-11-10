package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> words = new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("One");
		words.add("Two");
		words.add("Three");
		words.add("Four");
		words.add("Five");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < args.length + 1; i++) {
			System.out.println(words);
		}
		
		//4. Print all the Strings using a for-each loop
		for (String s: words) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < args.length + 1; i+=2) {
			System.out.println(words.get(i));
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
