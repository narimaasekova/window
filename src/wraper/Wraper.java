package wraper;

public class Wraper {
	public static void main(String[] args) {
//
//		Boolean b = new Boolean(true);
//		Boolean b1 = new Boolean("true");
//		Character c = new Character('c');
//		Byte b3 = new Byte("123");
//		Byte b4 = new Byte((byte) 123);
//		Short s = new Short((short) 345);
//		Short s1 = new Short("123");
//		Integer i = new Integer("abc");
//		Integer i1 = new Integer(345);
//		Long l = new Long(12345L);
//		Long l1 = new Long("6789809");
//		Float f1 = new Float(2552.61);
//		Float f2 = new Float("654.67");
//		Double d1 = new Double(456.7988);
//		Double d2 = new Double("6545.6097");

		
		//wrapper class methods
		//converting String to primitive
		boolean b5 = Boolean.parseBoolean("true");
		Boolean b6 = Boolean.valueOf("false");
		b6 = b5;
		System.out.println(b5+" "+b6);
		
		Boolean b7 = null;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isAlphabetic('Z'));
		 
		//r1==r2 -->>true same object
		
		Character c = new Character('c');
		Character x = 'x';
		
		//String to primitive : X.parseX(str)
		//primitive wrapper objects:
		
		//any ntype that is not primitive is Reference Type
		 
//		byte bt =Byte.parseByte("8");
//		Short.parseShort("34");
//		Integer.parseInt("23");
//		Long.parseLong("5753");
//		Float.parseFloat("453");
//		Double.parseDouble("563");
		
//		//converting String to wrapper class Object
//		Boolean.valueOf("FALSE");
//		Byte.valueOf("1");
//		Short.valueOf("1");
//		Integer.valueOf("242");
//		Long.valueOf("45634");
//		Float.valueOf("454");
//		Double.valueOf("456345");
		
		
	

	
		
	}
}
