package beans;
import java.util.List;
	import java.util.ArrayList;
public class Tea extends Drink{

	
	

		
		private static List<String> options;
		public Tea(String name, String size, int calories, double price) {
			super(name, size, calories, price);
			
		}

		static {
			options=new ArrayList<>();
			options.add("CINNAMON CHAI LATTE");
			options.add("CLASSIC CHAI TEA LATTE");
			options.add("PEACH GREEN TEA LEMONADE");
			options.add("SHAKED ICED TEA");
			options.add("VERY BERY HIBISCUS");
		
		}
		
		public void setName(String name) {
//			make sure cofee name is present as one of options

			if(options.contains(name.toUpperCase())) {
				super.setName(name);
			}else 
				System.out.println("TEANameNOTFoundException : "+name);
			}
		public String toString() {
			
			 return "Tea [name=" + getName() + ", size=" + getSize() + ", calories=" + getCalories() + ", price=" + getPrice()
					+ "]";
		}
}
