package stringreverse;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Vvedite neskolko posledovatelnotei simvolov annagrammy i nazhmite 'Enter'");
		String strofsymbols=scanner.nextLine();
		
		
// strofsymbols="a1bsd efg!h";
		
		WordReverse wordReverse=new WordReverse();
		
		
		String[]words=strofsymbols.split(" ");
		for (String str:words) {
			
		char[] word=str.toCharArray();
		wordReverse.reverseWords(word);



		
	}
		
	}
}
		
		
		
	


