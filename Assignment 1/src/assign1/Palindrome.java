package assign1;

/** 
 * Name: Brando Flores
 * Class ID: 70641
 * This program takes a string input and creates Palindrome
 * objects. Palindrome objects can be tested if they are
 * indeed a palindrome.
 * 
 * @author Brando Flores
 * @version 1.0
 */
public class Palindrome {
	private String testString;
	
	/**
	 * Constructor used to create Palindrome objects.
	 * Palindrome objects can be tested if they are indeed
	 * a palindrome.
	 * @param testString
	 */
	public Palindrome( String testString ) {
		this.testString = testString;
	}
	
	/**
	 * This method tests if a string is a palindrome.
	 * It ignores case, whitespace, and punctuation.
	 * If the string does not contain alphanumeric characters,
	 * it is considered a palindrome.
	 * @return boolean if objects is a palindrome
	 */
	public boolean isPalindrome() {
		
		// Front keeps track of the front of the string
		// and last keeps track of the back
		int front = 0;
		int last = testString.length() - 1;
		boolean isPal = true;
		
		while ( last > front && isPal == true ){
			// First check if both characters being compared are alphanumeric
			// If they are not, advance to next character
			if ( !Character.isLetterOrDigit(testString.charAt(front)) ) {
				front++;
			}	
			if ( !Character.isLetterOrDigit(testString.charAt(last)) ) {
				last--;
			}
			
			// If both characters are alphanumeric, compare them for equality
			// If they are not equal, we know immediately that the string
			// is not a palindrome.
			// Otherwise, advance to the next characters.
			if ( Character.isLetterOrDigit(testString.charAt(front)) 
					&& Character.isLetterOrDigit(testString.charAt(last)) ) {
				if ( testString.toLowerCase().charAt(front) 
						!= testString.toLowerCase().charAt(last) ) {
					isPal = false;
				}
				front++;
				last--;
			}
		}
	
		return isPal;
	}
}
