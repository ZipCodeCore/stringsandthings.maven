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
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int countOfYZ = 0;
        String[] inputToArrayOfWords = input.split(" ");
        for (String word : inputToArrayOfWords) {
            if (word.endsWith("y") || word.endsWith("z")) {
                countOfYZ += 1;
            }
        }
        return countOfYZ;
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
        String newString = base.replaceAll(remove, "");
        return newString;
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
        boolean isAppearsSameNumberOfTimesAsNot = true;
        int isCount = 0;
        int notCount = 0;
        int numberOfIsIndex = 0;
        int numberOfNotIndex = 0;
        int numberOfIs = 0;
        int numberOfNot = 0;
        while ((numberOfIsIndex = input.indexOf("is", isCount)) != -1) {
            isCount = numberOfIsIndex + 2;
            numberOfIs++;
        }
        while ((numberOfNotIndex = input.indexOf("not", notCount)) != -1) {
            notCount = numberOfNotIndex + 2;
            numberOfNot++;
        }
        if (numberOfIs == numberOfNot) {
         isAppearsSameNumberOfTimesAsNot = true;
        }
        else {
            isAppearsSameNumberOfTimesAsNot = false;
        }
        return isAppearsSameNumberOfTimesAsNot;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean gIsHappy = false;
        char[] inputToCharArray = input.toCharArray();
        for (int i = 1; i < inputToCharArray.length - 1; i++) {
             if (inputToCharArray[i] == 'g' && (inputToCharArray[i - 1] == 'g' || inputToCharArray[i + 1] == 'g')) {
                 gIsHappy = true;
             }
             else if (inputToCharArray[i] == 'g' && (inputToCharArray[i - 1] != 'g' || inputToCharArray[i + 1] != 'g')) {
                 gIsHappy = false;
             }
             else if (inputToCharArray[0] == 'g' && inputToCharArray[1] == 'g') {
                 gIsHappy = true;
             }
        }
        return gIsHappy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int numberOfTriples = 0;
        char[] inputToArray = input.toCharArray();
        for (int i = 0; i < inputToArray.length - 2; i++) {
            if (inputToArray[i] == inputToArray[i + 1] && inputToArray[i] == inputToArray[i + 2]) {
                numberOfTriples += 1;
            }
        }
        return numberOfTriples;
    }
}
