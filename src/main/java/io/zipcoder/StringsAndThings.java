package io.zipcoder;


import javafx.beans.binding.Bindings;

import java.util.Arrays;

/**
 * @author tariq
 */
public class StringsAndThings {
    public static void main(String[] args) {


    }
        /**
         * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
         * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
         * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
         * example : countYZ("fez day"); // Should return 2
         *           countYZ("day fez"); // Should return 2
         *           countYZ("day fyyyz"); // Should return 2
         */

        public Integer countYZ(String input)
        {
            Integer count = 0;
            String[] word = input.split(" "); //Split string by white spaces
            String arrayString = Arrays.toString(word); //created new array

            //System.out.println(arrayString);

            for (String s : word) {
                // assigned each word to newString
                // assigned last letter of each word to lastLetter Character variable
                Character lastLetter = s.charAt(s.length() - 1);

                //System.out.println(lastLetter);
                if (lastLetter.equals('y') || lastLetter.equals('z')) { // Adds to count if "y" or "z" is found
                    count++;
                }

            }


            return count;
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

        public Object removeString (String base, String remove)
        {
            int baseLength = base.length();
            int removeLength = remove.length();
            char[] charArray = base.toCharArray();
            int j = 0;

            for (int i = 0; i < baseLength; i++) {


                if (i < baseLength - removeLength + 1 && base.substring(i, i + removeLength).equals(remove)) {
                    i += removeLength - 1;


                } else {
                    charArray[j] = base.charAt(i);
                    j++;
                }
            }

            String str = String.valueOf(charArray);

            return str.substring(0, j);

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
        int countNot = 0;
        int countIs = 0;

        for (int i = 0; i < input.length(); i++) {


            if (i < input.length() - 2 && input.substring(i, i + 3).equals("not")) {
                countNot++;
                i += 2;


            } else if (i < input.length() - 1 && input.substring(i, i + 2).equals("is")) {
                countIs++;
                i += 1;
            }
        }

        return countNot == countIs;
    }


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */

    public Boolean gIsHappy(String input) { // one of the tests didn't pass don't really know why?? will solve later
        boolean happy = true;

        for (int i = 0; i < input.length(); i++) {

            if (input.length() == 1 && input.charAt(i) == 'g') {
                happy = false;
                break;
            } else if (i < input.length() - 1
                    && input.charAt(i) == 'g'
                    && input.charAt(i + 1) != 'g'
                    && input.charAt(i - 1) != 'g') {
                happy = false;
                break;
            } else if (i == input.length() - 1
                    && input.charAt(i) == 'g'
                    && input.charAt(i - 1) != 'g') {
                happy = false;
                break;
            }
        }
        return happy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */

    public Integer countTriple(String input) {

        int strLength = input.length();
        int count = 0;
        for (int i = 0; i < strLength - 2; i++) {

            char tmp = input.charAt(i);
            if (tmp == input.charAt(i + 1) && tmp == input.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }
}


