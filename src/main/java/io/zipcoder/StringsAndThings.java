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


        String[] words = input.split(" ");
        Integer numOfWords = 0;

        for (String word : words) {
            if (word.charAt(word.length() - 1) == 'y' || word.charAt(word.length() - 1) == 'z') {
                numOfWords++;
            }
        }
        return numOfWords;
    }



        /*int count = 0;
        String[] theArray = input.split(" ");
        for (int i = 0; i < theArray.length; i++) {
            String words = theArray[i];
            int numCharact = words.length();              // THIS ALSO WORKS
            int lastIndex = numCharact - 1;
            char lastChar = words.charAt(lastIndex);
            if (lastChar == 'y' || lastChar == 'z') {

                count++;
            }
        }


        return count;*/



    //}

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
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
Integer theIs = 0;
Integer theNot = 0;

for (int theChar = 0;  theChar < input.length() -1;  theChar ++ ) {

    if (input.charAt(theChar) == 'i' && input.charAt(theChar + 1) == 's') { // esas letras tiene "is" (la i y s)
        theIs++;
    }
    if (input.charAt(theChar) == 'n' && input.charAt(theChar + 1) == 'o' && // estas tiene "not" (n y o y t)
            input.charAt(theChar + 2) == 't') {
        theNot++;
    }
}
        return theIs.equals(theNot);
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

        Boolean gIsHappy = false;
           for (int i = 0; i < input.length() - 1; i++) {
               if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {
                   gIsHappy = true;
                       //break;
            }
        }
        return gIsHappy;
    }

        /*return input.contains("gg");
     int counter = 0;
     int gIsHappy = 0;
            for (int i = 0; i  < input.length() -1; i++){
                 if (input.charAt(i) == 'g' && input.length() -1 )
                  //if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {



            return input.contains("gg");*/


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int counter = 0;
        input = input.toLowerCase();
        for (int i = 0; i <= input.length() - 1; i++) {
            if (input.charAt(i) == 'x' && input.charAt(i+1) == 'x' && input.charAt(i+2) == 'x' ||
                    input.charAt(i) == 'y' && input.charAt(i+1) == 'y' && input.charAt(i+2) == 'y'  ) {
                counter++;
            }
    }
        return counter;
    }
}

    ///










