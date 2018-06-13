package wraper;

public class Wrap {
public static void main(String[] args) {
	
	String str = "AZVFTDDTDD";
	
	StringBuilder sb = new StringBuilder (str);
	int i1 = sb.indexOf("D");
	sb.deleteCharAt(i1);
	System.out.println(sb);
	//sb.deleteCharAt(sb.lastIndexOf("D"));
	int i2 = sb.lastIndexOf("D");
	System.out.println(i2);
	sb.delete(i2, i2+1);
	
	
	
	
	
sb.delete(sb.indexOf("A"), sb.indexOf("A")+1);
	System.out.println(sb);
	//insert " ictory" after the character 'V'
	int i3 = sb.indexOf("V");
	
	sb.insert(i3+1, "ictory");
	System.out.println(sb);
	

	// change the 1-occurance of'D' to 'K'
	int iD = sb.indexOf("D");
   	sb.setCharAt(iD, 'K');
	// what is character at index 4
    sb.charAt(4);
	System.out.println(sb.charAt(4));
	
	
	
	
}
}
