package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
    	//* `flipConcat` should concatenate `string1` to the end of `string2`.
        return string2 + string1;
    }

    public char getChar(String string, int index) {
    	//* `getChar` should get the `index` character of `string`.
    		char result = string.charAt(index);
        return result;
    }

    public String iCantSee(String string) {
    	//* `iCantSee` should return a `String` of whitespace the same length as `string`.
    		StringBuilder result = new StringBuilder();
    		for(int i = 0; i < string.length(); i++) {
    			result.append(" ");
    		}
        return result.toString();
    }

    public String loudAndClear(String string) {
    	//* `loudAndClear` should return a `String` that is the equivalent of `string` 
    	//with all uppercase letters.

        return string.toUpperCase();
    }

    public String reverseCase(String string) {
    	//* `reverseCase` should return the `string` but switches the casing of 
    	//alphabetical characters.
//    		StringBuilder result = new StringBuilder();
	    	char[] chars = string.toCharArray();
	        for (int i = 0; i < chars.length; i++)
	        {
	            char c = chars[i];
	            if (Character.isUpperCase(c))
	            {
	                chars[i] = Character.toLowerCase(c);
	            }
	            else if (Character.isLowerCase(c))
	            {
	                chars[i] = Character.toUpperCase(c);
	            }
	        }
	        return new String(chars);
    }

    public String oneAtATime(String string1, String string2) {
    	//* `oneAtATime` should merge the inputs one character at a time 
    	//and return that `String`.
    		//store the final result
    		StringBuilder result = new StringBuilder();
    		// For every index in the strings
    		for (int i = 0; i < string1.length() || i< string2.length(); i++) {
    				// First choose the ith character of the 
                // first string if it exists
				if (i < string1.length()) {
					result.append(string1.charAt(i));
				}
				
				if (i < string2.length()) {
					result.append(string2.charAt(i));
				}
			}
    		
        return result.toString();
    }
}
