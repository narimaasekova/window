package beans;
import java.util.List;
import java.util.ArrayList;
public class Cofee extends Drink{

	/*
	 * sub class of Drink class
	 * it will be used to store cofee menu options in starbucks
	 */
	private static List<String> options;
	public Cofee(String name, String size, int calories, double price) {
		super(name, size, calories, price);
		
	}

	static {//static block runs once when class loads(CLASSLOADER)
		/*adding coffee menu options to ArrayList
		 * 
		 */
		options=new ArrayList<>();
		options.add("FRESHLY BREWED COFFEE");
		options.add("ICED COFFEE");
		options.add("CAFFE AMERICANO");
		options.add("FLAT WHITE");
		options.add("CAFFE LATTE");
		options.add("CARAMEL MACHIATO");
		options.add("WHITE CHOCOLATE MOCHA");
		options.add("CAFFE MOCHA");
	}
	
	public void setName(String name) {
		/*
		 * ovveriiding so that only items on the options can be selected
		 */
//		make sure cofee name is present as one of options

		if(options.contains(name.toUpperCase())) {
			super.setName(name);
		}else 
			System.out.println("CoffeeNameNOTFoundException : "+name);
		}
		
	public String toString() {
		/*
		 * overiding toString so that it gives description for coffee
		 */
		 return "\n Cofee [name=" + getName() + ", size=" + getSize() + ", calories=" + getCalories() + ", price=" + getPrice()
				+ "] ";
	}
//	}
	}

