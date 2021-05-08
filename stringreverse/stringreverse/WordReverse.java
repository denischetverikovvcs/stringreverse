package stringreverse;

public class WordReverse {
	private String stringForPrinting=" ";
	public void reverseWords(char word[]) {
	int i=0;
	int j=word.length-1;
		
		while(i<j) {
			if (!Character.isLetter(word[i])) {
				i++;
			}
			if(!Character.isLetter(word[j])) { 
				j--;
			}
			else {
				char temp =word [i];
				word[i]=word[j];
				word[j]=word[i];
				word[j]= temp;
				i++;
				j--;
			}}
			//String wordForPrinting=Character.toString(word);
			//System.out.println("1");
			
		System.out.print(String.valueOf(word));
		System.out.print(" ");
					}
		
		
	
}

