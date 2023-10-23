package io.zipcoder;


import java.util.regex.Matcher;
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
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int lenInput = input.length();

        int count = 0;

        input = input.toLowerCase();

        for (int i = 0; i < lenInput; i++) {

            if (input.charAt(i) == 'y' || input.charAt(i) == 'z') {

                if (i < (lenInput - 1) && !Character.isLetter(input.charAt(i + 1))){
                    count++;

                } else if (i == (lenInput-1)) {

                    count++;

                }else {}

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
    public String removeString(String base, String remove){
        return base.replace(remove,"");
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
        /*

        Test1 and Test2 should be reversed (Test1 should assert to false and Test2 should assert to true
         */

        Pattern wordIs = Pattern.compile("is");
        Matcher match = wordIs.matcher(input);

        int matchIs = 0;
        int matchNot = 0;

        while (match.find()) {
            matchIs++;
        }

        Pattern wordNot = Pattern.compile("not");
        Matcher match2 = wordNot.matcher(input);

        while (match2.find()){
            matchNot ++;
        }
        return matchIs == matchNot;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false  **** the test asserts true
     */
    public Boolean gIsHappy(String input){

        int count = 0;
        int inputLen = input.length();

        for (int i = 0; i < inputLen; i++){

            if (input.charAt(i) == 'g' && (input.indexOf(i) != input.indexOf(0) || input.indexOf(i) != input.lastIndexOf(input))){
                if (input.charAt(i-1) == 'g' || input.charAt(i+1) == 'g'){
                    // all g are happy
                } else {

                    // "xxggyygxxgg"
                    count ++;
                }
            }
        }
        return (count == 0);
    }



    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){

        String [] lettersPassed = input.split("");  // put each letter into an array
        int counter = 0;

        // loop through each letter in the array and see if the next two match; upper limit is less 2
        for (int i = 0; i < lettersPassed.length - 2; i++){

            if (lettersPassed[i].equals(lettersPassed[i+1]) && lettersPassed[i].equals(lettersPassed[i+2])){
                counter ++;
            }
        }
        return counter;
    }
}
