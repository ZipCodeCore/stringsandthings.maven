package io.zipcoder;


import java.lang.reflect.Array;
import java.util.ArrayList;

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


        // create a count variable
        int count = 0;
        // break down into individual words
        String[] words = input.split(" ");
        // for each word in words
        for (String word : words) {
            // get length of word
            int lengthOfWord = word.length();
            // get all letters of word
            char[] allLettersOfWord = word.toCharArray();
            // get last index
            int lastIndex = lengthOfWord - 1;
            // get last letter of word
            char lastLetter = allLettersOfWord[lastIndex];
            // if the last letter is y or z
            if (lastLetter == 'y' || lastLetter == 'z') {
                // increase counter by 1
                count += 1;
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
        // just using .replace method to replace the string to be removed with "" (that is, nothing)
        // this leaves just what remains
        return base.replace(remove, "");
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


        // another attempt a month later
        int length = input.length();

        int allTheIs = length - input.replace("is", "").length();
        int allTheNot = length - input.replace("not", "").length();

        if ((allTheIs * 3) == (allTheNot * 2)) {
            return true;
        }   return false;



//        // below is another attempt #2 at this problem
//        Integer length = input.length();
//        Integer withoutIs = input.replace("is", "").length();
//        Integer withoutNot = input.replace("not", "").length();
//
//        Integer howManyIs = (length - withoutIs) / 2;
//        Integer howManyNot = (length - withoutNot) / 3;
//
//        if (howManyIs == howManyNot) {
//            return true;
//        }
//
//        return false;


        // below is original attempt #1 at this problem
        // called removeString method from above to help solve


//        // called above method to help
//        // removed instances of is and not, then divided by 2 and 3 respectively
//        // that will effectively give you the number of is and nots
//        // then you can compare them to each other


//        int isCount = (input.length() - removeString(input, "is").length()) / 2;
//        int notCount = (input.length() - removeString(input, "not").length()) / 3;
//        return isCount == notCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

        // had to change Test1 to assertFalse, not assertTrue
        // had to change Test1 to assertFalse, not assertTrue
        // had to change Test1 to assertFalse, not assertTrue

        //convert string to array of letters
        char[] inputArray = input.toCharArray();
        // for loop to go through char[] input array
        // have to change constraints to accommodate the first and last index
        for (int i = 1; i < inputArray.length - 1; i++) {
            // check if a g doesn't appear either before and after
            // return false
            if (inputArray[i] == 'g') {
                if (inputArray[i - 1] != 'g' || inputArray[i + 1] != 'g') {
                    return false;
                }
            }

        }
        // otherwise return true
        return true;

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
        char[] array = input.toCharArray();

        // for middle part of for loop you can use array.length - 1 like i did here
        // or you could use input.length() - 1;
        // either will work fine. they are just different ways to say the same thing
        // we converted input to array, so they will be same length
        // int i = 1 so we don't get an out of bounds exception, since we will be considering the elements both before and after i.
        // cannot start at int i = 0 because if we compare to the one before it, it will not exist.
        for (int i = 1; i < array.length - 1; i++) {

            // created a variable for easier conditions in if statement
            // although this isn't necessary
            char c = array[i];

            // you can use c here. or array[i] since they are equal things
            // here i used both to demonstrate that either reference would work
            if ((c == (array[i - 1])) && (c == (array[i + 1]))) {
                counter++;
            }

        }
        return counter;


        // below is the original way i completed this problem. above is simply another attempt at it.
//        // create counter
//        int counter = 0;
//        // turn string to char[] so we can use index
//        char[] inputArray = input.toCharArray();
//        // for loop to iterate through
//        for(int i = 1; i < input.length()-1; i++) {
//        // if statement checking if letter is the same both before and after
//           if (inputArray[i] == inputArray[i-1] && inputArray[i] == inputArray[i+1]) {
//               // if so, increase counter by one
//               counter = counter + 1;
//           }
//        }
//        // after loop exits, return counter
//        return counter;


    }
}

