package wraper;

import java.util.Scanner;
import java.util.*;

public class ArayList {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 names: ");

		for (int i = 0; i < 5; i++) {
			name.add(sc.nextLine());
		}

		for (String names : name) {
			System.out.println(names);
		}
		System.out.println(name);
		// print only first and last letter for each names
		// for(String names: name) {
		// System.out.println(names.charAt(0)+ " "+ names.charAt(names.length()-1)) ;
		// System.out.println(names);
		for (int i = 0; i < name.size(); i++) {
			String item = name.get(i);

			System.out.println(item.charAt(0) + " " + item.charAt(item.length() - 1));
		}
        boolean itemExist = name.contains("Adam");
		System.out.println("item exists : "+itemExist);
		int indexOfItem= name.indexOf("Adam");
		int lastIndexOfItem= name.lastIndexOf("Adam");
		System.out.println(indexOfItem +", "+ lastIndexOfItem);
		
		
		
		
		
	}
}
