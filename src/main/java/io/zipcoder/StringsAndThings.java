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
    public Integer countYZ(String input) {
        String words[] = input.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(words[i].length() - 1) == 'y' || words[i].charAt(words[i].length() - 1) == 'z') {
                count++;
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
        String word = base.replace(remove, "");
        return word;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    // is = not --> true
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        String isWord = input.replace("is", "/");
        String notWord = input.replace("not", "/");
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < isWord.length(); i++) {
            if (isWord.charAt(i) == '/')
                countIs++;
        }
        for (int i = 0; i < notWord.length(); i++) {
            if (notWord.charAt(i) == '/')
                countNot++;
        }
        if (countNot == countIs) ;
        return true;

    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    //WE'RE COUNTING THE UNHAPPIES, If there's one, FALSE!
    public Boolean gIsHappy(String input) {
        int counter = 0;
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'g' && (input.charAt(i + 1) == 'g' || input.charAt(i - 1) == 'g')) {
                counter++;
            } else {
                if (input.charAt(i) == 'g') counter = 0;
            }
        }
        return counter != 0;
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
        for (int i = 0; i < input.length() - 2; i++){
            char sameChar = input.charAt(i);
            if (sameChar == input.charAt(i + 1) && sameChar == input.charAt(i + 2)) {
                counter++;
            }
        }
        return counter;
    }
}