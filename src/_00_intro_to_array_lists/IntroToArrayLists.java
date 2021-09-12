package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> sList = new ArrayList<String>();
		//2. Add five Strings to your list
		sList.add("1o");
		sList.add("2e");
		sList.add("3o");
		sList.add("4e");
		sList.add("5o");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
		
			System.out.println(sList.get(i));
		}
		//4. Print all the Strings using a for-each loop
		
		for (String s : sList) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < sList.size(); i++) {
			if (i % 2 == 1) {
				System.out.println(sList.get(i));
			}
		}
		System.out.println("----------------------------------");
		//6. Print all the Strings in reverse order.
		for (int i = 4; 0 <= i; i--) {
			
			System.out.println(sList.get(i));
		}
		System.out.println("----------------------------------");
		//7. Print only the Strings that have the letter 'e' in them.
		for (String s : sList) {
		if (s.contains("e")) {
			System.out.println(s);
		}
		}
		
		}
		
	}

