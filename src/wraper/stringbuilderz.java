package wraper;

public class stringbuilderz {

	public static void main(String[] args) {
		//given a word "ABCD29ACC3928EBBFG9302SD"
		//task: use StrinBuilder to store only letter  ABC, for example: ABCACCBB
		//task 2 : use StringBuilder to replace character from 4-6 to ZZZ: example: ABCAZZZB
		
		String word = "ABCD293928EFG9302HIB";
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)>='A' &&  word.charAt(i)<='C' ) {
				sb.append(word.charAt(i));	
			}
		}
		System.out.println(sb.toString());
		System.out.println(sb);
		sb.replace(4, 7, "ZZZ");
		System.out.println(sb.toString());
	}
}
