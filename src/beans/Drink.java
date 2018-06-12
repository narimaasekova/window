package beans;

public class Drink {
	private String name;
	private String size;
	private int calories;
	private double price;
	/**
	 *this is super class for any drink subclasses 
	 *
	 */
	
	
	public Drink(String name, String size, int calories, double price) {
		super();
		setName ( name);
//		this.name = name;
//		this.size = size;
		setSize (size);
		this.calories = calories;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		
			
		
		return size;
	}
	public void setSize(String size) {//this will check first if size matches
		if(size.equals("tall") || size.equals("grande")||size.equals("venti")) {			
		this.size = size;}
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Drink [name=" + name + ", size=" + size + ", calories=" + calories + ", price=" + price
				+ "]";
	}
	
	
}
