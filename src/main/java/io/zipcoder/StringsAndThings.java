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
        int count = 0;
        String[] inputSplit = input.split(" ");
        for (int i = 0; i < inputSplit.length; i++) {
            if (inputSplit[i].charAt(inputSplit.length - 1) == 'y' ||
                    inputSplit[i].charAt(inputSplit.length - 1) == 'z') {
            }
            count++;
        }
        return count;
    }
        /*
        Character findYZ[] = {'y', 'z'};
        int count = 0;

        for (int i = 0; i < findYZ.length; i++) {
            Character character = findYZ[i];
            count = count + 1;
        }
        return count;
        */
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
        String newString = base.replaceAll(remove, "");
        return newString;
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
        int countIs = 0;
        int countNot = 0;
        int index = input.indexOf("not");
        String currString = input;

        while (index >= 0) {
            currString = currString.replaceFirst("not", "");
            index = currString.indexOf("not");
            countNot++;
        }
        currString = input;
        index = currString.indexOf("is");

        while(index >= 0) {
            currString = currString.replaceFirst("is", "");
            index = currString.indexOf("is");
            countIs++;
        }
        return countIs == countNot;
    }
/*
        CharSequence isString = "is";
        CharSequence notString = "not";
        String[] inputSplit = input.split(" ");
        for (int i = 0; i < inputSplit.length; i++) {
            if (inputSplit[i].contains(isString)) {
                countIs++;
            }
            if (inputSplit[i].contains(notString)) {
                countNot++;
            }
        }
        if (countIs == countNot) {
            return true;
        } else {
            return false;
        }
        */
        /*
        if (input.contains(isString)) {
            countIs++;
        } if (input.contains(notString)) {
            countNot++;
        }
        if(countIs == countNot) {
            return true;
        } else {
            return false;
        }
     */
    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
// if current char is g, if char + 1 or -1 is g then return true
    public Boolean gIsHappy(String input) {
        boolean bool = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g') {
                if (input.charAt(i + 1) != 'g' && input.charAt(i - 1) != 'g') {
                    bool = false;
                }
            }
        }
        return bool;
    }

//            for (int j = i + 1; j < input.length(); j++) {
//                if (input.charAt(i) == input.charAt(j)) {
//                    return true;
//

    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                if (input.charAt(i + 1) == input.charAt(i + 2)) {
                    count ++;
                }
            }
        }
        return count;
    }
}
