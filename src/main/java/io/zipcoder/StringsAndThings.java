package io.zipcoder;

import java.util.regex.Pattern;

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
        //Count the letters need counter variable
        int count = 0;
        // Split word in two
        String[] parts = input.split(" ");
        // Place in a loop to iterate the characters
        for (int i = 0; i < parts.length; i++) {
            // Check to see if words ends with y or z
            if (parts[i].trim().endsWith("y") || parts[i].trim().endsWith("z")) {
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
        String one = base + remove;
        one = (one.replace(remove, ""));
        return one;
    }
        /**
         * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
         * to the number of appearances of "not" anywhere in the string (case sensitive)
         *
         * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
         *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
         *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
         */
      public Boolean containsEqualNumberOfIsAndNot (String input){
          // Place input into a split string variables
          int one = (input.split("is", -1).length) - 1;
          int two = (input.split("not", -1).length) - 1;
          // If string equals "is" and "not" return true
          if (one == two) {
              return true;
          } else {
              return false;
          }
      }

        /**
         * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
         * Return true if all the g's in the given string are happy.
         * example : gHappy("xxggxx") // Should return  true
         *           gHappy("xxgxx") // Should return  false
         *           gHappy("xxggyygxx") // Should return  false
         */
       public Boolean gIsHappy (String input) {
           // Check if input contains consecutive string
           if (input.contains("gg")) {
               // If true return true
               return true;
           } else {
               // or return false
               return false;
           }
       }

        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
        public Integer countTriple (String input) {
            // Setup counter to count result
            int counter = 0;
            // Setup char variable
            char c = 0;
            // Setup for loop to iterate through characters
            for (int i = 0; i < input.length() - 1; i++) {
                // Find characters
                c = input.charAt(i);
                System.out.println(c);
                // If character equals another characters run counter
                if (c == input.charAt(i + 1) && c == input.charAt(i + 2)) {
                    counter++;
                }
            }
            return counter;
        }
}