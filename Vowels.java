import java.util.Scanner;
public class Vowels {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //declaring scanner object to use for user input
		System.out.println("Please enter a string....eg... a word or leter");
		String str = keyboard.nextLine(); //setting String str equal to user input
		
		System.out.println("The number of vowels in the string are: " + countVowel(str));  //prints static method
        keyboard.close();  //closes scanner object, it is no longer needed
	}
	  public static int countVowel(String str) {  //static method to count vowels in a given string
		  int vowelcount = 0;  //setting vowel count equal to 0
		  
		  for (int i = 0; i <str.length(); i++) {
			  
			  if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'  //if loop goes through all of the user input string and checks if any index location has any of those vowels inserted for the char
	                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				  
				  
				  
				  vowelcount++; //increment vowel count everytime any str index has a vowel in it
			  }
			  
			  
			  
		  }
		  return vowelcount;  //exit from method
	  }

}
