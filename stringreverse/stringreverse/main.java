package stringreverse;

import java.util.Scanner;

@SuppressWarnings("serial")

class EmptyStringException extends Exception{
	
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Vvedite neskolko posledovatelnotei simvolov annagrammy i nazhmite 'Enter'");
		
		
		try { String strofsymbols=scanner.nextLine();
		if(strofsymbols.isEmpty()) {
			throw new EmptyStringException();
		}
		
// strofsymbols="a1bsd efg!h";
		
		WordReverse wordReverse=new WordReverse();
		
		
		String[]words=strofsymbols.split(" ");
		for (String str:words) {
			
		char[] word=str.toCharArray();
		wordReverse.reverseWords(word);



		
	
		}
		}
		catch (EmptyStringException e) {
			System.out.println("??? Vy nichego ne vveli");
		}
	}
}

		
		
		
		
	


