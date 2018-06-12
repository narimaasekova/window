package tests;
import org.junit.Test;
import beans.Cofee;
import beans.Drink;
import beans.Tea;
import runners.App;

public class UnitTests {
@Test
public void cofeeTests() {
	Cofee cofee = new Cofee("FRESHLY BREWED COFFEE", "tall", 5, 1.75) ;
		System.out.println(cofee.toString());
		Drink cofee2 = new Drink("WATER", "venti", 6, 1.75);
	    System.out.println(cofee2.toString());

	    
	    Tea tea = new Tea("PEACH GREEN TEA LEMONADE", "grande", 130, 3.25);
	    System.out.println(tea.toString());
	    
	 
	    
}
}
// B B again