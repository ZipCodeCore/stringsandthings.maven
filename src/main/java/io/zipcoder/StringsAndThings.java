package io.zipcoder;


import com.sun.org.apache.xpath.internal.operations.Bool;

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
        String[] wordsOfString = input.split(" ");
        int counter = 0;
        for (int i = 0; i < wordsOfString.length; i++) {
           if (wordsOfString[i].endsWith("y") || wordsOfString[i].endsWith("z")) {
               counter++;
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
        int inputLength = input.length(); //11

        String inputWithoutIs = removeString(input, "is"); //"th  not"
        int inputWOLength = inputWithoutIs.length(); //7
        int diffOfIs = inputLength - inputWOLength; //11-7 = 4
        int numberOfIs = diffOfIs/2; //4/2 2 is the size of "is"

        String inputWithoutNot = removeString(input, "not"); //"this is "
        int inputWONotLength = inputWithoutNot.length(); //8
        int diffOfNot = inputLength - inputWONotLength; // 11-8 = 3
        int numberOfNot = diffOfNot/3; //3/3 =1 3 is the size of "not"

        return numberOfIs == numberOfNot;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        //check if g  is to the left or right
        boolean isGHappy = false;
        Pattern ggs = Pattern.compile("gg");
        Matcher foundGG = ggs.matcher(input);
        if (foundGG.find()) {
            String goodbyeGG = removeString(input, "gg");
            isGHappy = !goodbyeGG.contains("g");
        }
        return isGHappy; //returning true or false
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int counter = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && (input.charAt(i + 1) == input.charAt(i + 2))) {
                counter++;
            }

        }
        return counter;
    }
}
