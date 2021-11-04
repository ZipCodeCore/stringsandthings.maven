package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {


    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        // create a count variable
        int count = 0;
        // break down into individual words
        String[] words = input.split(" ");
        // for each word in words
        for(String word : words) {
            // get length of word
            int lengthOfWord = word.length();
            // get all letters of word
            char[] allLettersOfWord = word.toCharArray();
            // get last index
            int lastIndex = lengthOfWord - 1;
            // get last letter of word
            char lastLetter = allLettersOfWord[lastIndex];
            // if the last letter is y or z
            if (lastLetter == 'y' || lastLetter == 'z') {
                // increase counter by 1
                count += 1;
            }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {

        return base.replace(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int isCount = (input.length() - removeString(input, "is").length()) / 2;
        int notCount = (input.length() - removeString(input, "not").length()) / 3;
        return isCount == notCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        char[] inputArray = input.toCharArray(); //convert string to array of letters

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 'g') {
                if (inputArray[i - 1] != 'g' || inputArray[i + 1] != 'g') {
                    return false;
                }
            }

        }
        return true;

    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int counter = 0;
        char[] inputArray = input.toCharArray();

        for(int i = 1; i < input.length()-1; i++) {

           if (inputArray[i] == inputArray[i-1] && inputArray[i] == inputArray[i+1]) {
               counter = counter + 1;
           }
        }

        return counter;





    }
}

