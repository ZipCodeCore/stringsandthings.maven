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
    public Integer countYZ(String input) {
        int count = 0; //counts the number of times the word ends in a 'y' or 'z'
        String[] numberOfWords = input.split(" "); // this splits where there is a space
        for (String word : numberOfWords) {
            int charactersInWord = word.length(); //this is checking the length of characters in a word
            char lastChar = word.charAt(charactersInWord - 1);  // we are looking for last character, because we count starting
                                                                // at zero, we have to subtract 1 for it to give us the
                                                                // correct last character
            if (lastChar == 'y' || lastChar == 'z') { //this is saying if the last character is either y or z then it will
                                                     // return our desired return
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
    public String removeString(String base, String remove) {

        return base.replace(remove, ""); //remove the characters that were passed through 'remove'
                                                    // because it replaces the characters with "" which is an empty string
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
        int is = 0;
        int not = 0;

       for (int i =0; i <= input.length() - 3; i++) {  // this is initiating at the beginning and running until 3 less than
                                                       // the length of the String "input"
           if (input.startsWith("is", i)) {  // IntelliJ recommended that I use the .startsWith instead of a substring.
                                                    // This allows it to check for "is"
               is++;                                      // This is allowing it to go to the next "is"
           } else if (input.startsWith("not", i)) { // Similar to line 65 except I have "else if" because it is
                                                        // saying if it isn't "is", then look for "not"
               not++;                                    // Continues to look for other "not"s
           }
       }

        return is == not;                               // Finally we compare "is" and "not", this will check to see
                                                                // if the appearances are equal
    }



    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    // g must be lowercase
    // g is only happy when directly next to another g
    // all g's in the string must be happy for it to return true
    // probably need to use char to detect a specific character, need lowercase to make sure it isn't a Gg or gG scenario
    public Boolean gIsHappy(String input) {
        for (int i = 0; i < input.length(); i++) { // the iterates and increments through
            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') { // this says that I have a character 'g' and
                                                                        // if there exists another 'g' next to that g
                                                                        // then gishappy and will return true.
                                                                        // (i + 1) just makes sure that the g's are next to each other.
                                                                        // We didn't need to add an (i-1)
                                                                        // because the left right part doesn't matter
                                                                        // because when it finds 'g' it will read from
                                                                 // left to right, so that first 'g' will always be the left g.
                return true;
            }
        }
        return false;
    }

    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
   public Integer countTriple(String input){
        int count = 0; //counts number of times

        for (int i = 0; i <= input.length() - 3; i++) { // the - 3 is there because we are looking for a three character string inside of a larger string
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i+2))
            count++;

         }
       return count;
    }

}
