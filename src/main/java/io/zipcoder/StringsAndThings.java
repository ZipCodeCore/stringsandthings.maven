package io.zipcoder;


import java.util.Locale;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        Integer counter = 0; //counter for loop
        String[] wordsArray = input.toLowerCase().split(" "); //split string up into words by delimiter "space", ignoring case

        //for the length of the array, check the last letter in each individual word of the wordsArray and compare to y or z
        //if either y or z are found, increase the counter by 1
        for (int i = 0; i < wordsArray.length; i++) {
            String wordyz = wordsArray[i];
            int len = wordyz.length()-1;

            if (Character.isLetter(wordyz.charAt(len))) {
                if (wordyz.charAt(len) == 'y' || (wordyz.charAt(len) == 'z')) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        return base.replaceAll(remove, ""); //replaces remove string with empty string
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        //convert string to a character array
        char[] isAndNot = input.toLowerCase().toCharArray();

        //counters for 'is' and 'not' to later compare for Boolean
        Integer isCount = 0;
        Integer notCount = 0;

        //check to see if sequence of chars 'i' and 's' and if so, increase isCount
        for (int i = 0; i < isAndNot.length-1; i++) {
            if (input.charAt(i) == 'i' && input.charAt(i + 1) == 's') {
                isCount++;
            }
        }
        //check to see if sequence of chars 'n', 'o', 't', and if so, increase notCount
        for (int i = 0; i < isAndNot.length-2; i++) {
            if (input.charAt(i) == 'n' && input.charAt(i+1) == 'o' && input.charAt(i+2) == 't') {
                notCount++;
            }
        }

        return isCount.equals(notCount);
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

        for (int i = 1; i < input.length()-1; i++) {
            if((input.charAt(i) == 'g' && input.charAt(i+1) != 'g')
                    && (input.charAt(i) == 'g' && input.charAt(i-1) != 'g')) {
                return false;
            }
        }
        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        Integer counter = 0;
        for (int i = 1; i < input.length()-1; i++) {

            if(input.charAt(i) == input.charAt(i-1)
                    && input.charAt(i) == input.charAt(i+1)) {
                counter++;
            }
        }
        return counter;
    }
}
