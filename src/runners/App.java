package runners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import beans.Cofee;
import beans.Tea;
/*
 * this class is loading all menu options and asking user to select
 */
public class App {
	
	private static  List<Cofee> coffeeList= new ArrayList<>();;
	private static List<Tea> teaList = new ArrayList<>();;
	private static Scanner scan = new Scanner(System.in);
	
	static {
		coffeeList.add(new Cofee("ICED COFFEE", "tall", 60, 2.25));
		coffeeList.add(new Cofee("ICED COFFEE", "grande", 90, 2.65));
		coffeeList.add(new Cofee("ICED COFFEE", "venti", 120, 2.95));
		
		coffeeList.add(new Cofee("FRESHLY BREWED COFFEE", "tall", 5, 1.75));
		coffeeList.add(new Cofee("FRESHLY BREWED COFFEE", "grande", 5, 2.10));
		coffeeList.add(new Cofee("FRESHLY BREWED COFFEE", "venti", 5, 2.35));
		
		coffeeList.add(new Cofee("CAFFE AMERICANO", "tall", 10, 2.25));
		coffeeList.add(new Cofee("CAFFE AMERICANO", "grande", 15, 2.65));
		coffeeList.add(new Cofee("CAFFE AMERICANO", "venti", 25, 2.95));
		
		coffeeList.add(new Cofee("FLAT WHITE", "tall", 170, 3.75));
		coffeeList.add(new Cofee("FLAT WHITE", "grande", 15, 2.65));
		coffeeList.add(new Cofee("FLAT WHITE", "venti", 25, 2.95));
		
		coffeeList.add(new Cofee("CARAMEL MACHIATO", "tall", 180, 3.75));
		coffeeList.add(new Cofee("CARAMEL MACHIATO", "grande", 240, 4.25));
		coffeeList.add(new Cofee("CARAMEL MACHIATO", "venti", 300, 4.65));
		
		//LOAD TEA OBJECTS TO ARRAYLIST
		
		teaList.add(new Tea("CINNAMON CHAI LATTE", "tall", 150, 3.45 ));
		teaList.add(new Tea("CINNAMON CHAI LATTE", "grande", 200, 4.25));
		teaList.add(new Tea("CINNAMON CHAI LATTE", "venti", 250, 4.65));
		
		teaList.add(new Tea("CLASSIC CHAI TEA LATTE", "tall", 190, 3.25));
		teaList.add(new Tea("CLASSIC CHAI TEA LATTE", "grande", 240,3.95 ));
		teaList.add(new Tea("CLASSIC CHAI TEA LATTE", "venti", 310, 4.25));
		
		teaList.add(new Tea("PEACH GREEN TEA LEMONADE", "tall", 100, 2.75));
		teaList.add(new Tea("PEACH GREEN TEA LEMONADE", "grande", 130, 3.25));
		teaList.add(new Tea("PEACH GREEN TEA LEMONADE", "venti", 190, 3.75));
		
		teaList.add(new Tea("SHAKEN ICED TEA", "tall", 60, 1.75));
		teaList.add(new Tea("SHAKEN ICED TEA", "grande", 80, 2.25));
		teaList.add(new Tea("SHAKEN ICED TEA", "venti", 120, 2.65));
		
		teaList.add(new Tea("VERY BERRY HIBISCUS", "tall", 60, 2.95));
		teaList.add(new Tea("VERY BERRY HIBISCUS", "grande", 70, 3.45));
		teaList.add(new Tea("VERY BERRY HIBISCUS", "venti", 100, 3.95));
	}
	
public static void run() {
	System.out.println("=============WELCOME TO STURBUCKS=================");
	System.out.println(  "==============OUR COFFEE MENU=================");
	System.out.println(coffeeList.toString());
	
	int totalPrice =0;
	int totalCalories = 0;
	
	System.out.println("your budget");
	double cash = scan.nextDouble();
	
	System.out.println("your calory reason");
	int caloriesLimit = scan.nextInt();
	
	
	
	while(true) {
		System.out.println("PLEASE SELECT YOUR COFFEE ");
		int selection = scan.nextInt();
		
		if(selection <=0 || selection> coffeeList.size()) {
			System.out.println("invalid selection");
			continue;
			
		}
		Cofee coffee = coffeeList.get(selection-1);
		System.out.println(coffee.toString());
		
		//put a condition to make sure our totalPrice and totalCalories is not going over the limit set at start
        if (totalPrice +coffee.getPrice()>cash || 
        		totalCalories+coffee.getPrice()>caloriesLimit) {
        	   if (totalPrice +coffee.getPrice()>cash) {
        			System.out.println("cannot process request. budget over the limit! "); 
        	   }else {
        			System.out.println("cannot process request. caloriecs over the limit! ");
        	   }
            
    		System.out.println("total price: "+ totalPrice);
    		System.out.println("total Calories: "+ totalCalories);
    	
        	break;
        }
		totalPrice +=(double) coffee.getPrice();
        totalCalories += (int)coffee.getCalories();
        
		System.out.println("total price: "+ totalPrice);
		System.out.println("total Calories: "+ totalCalories);
	
	}
}
}
