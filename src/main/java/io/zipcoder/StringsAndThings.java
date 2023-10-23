package io.zipcoder;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;

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
        int yZTotal = 0;

        String[] inputSplit = input.split(" ");
        //int length = inputSplit.length;
        for (String s : inputSplit) {
            if (s.endsWith("y") || s.endsWith("z")) {
                yZTotal++;
            }
        }
            return yZTotal;

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
        return base.replaceAll(remove, "");
            
        }


        
//        int baseIndex = base.indexOf(remove);
//        int baselength = base.length();
//        for (String remove: base) {
//            String part1 = base.substring(0,baseIndex);
//            String part2 = base.substring(baseIndex+1,baselength);
//            newWord.append(part1);
//            newWord.append(part2);
//        }
//
//



    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        //        String[] isArray = input.split("is");
//        String[] notArray = input.split("not");
//        Integer isArrayLength = isArray.length;
//        Integer notArrayLength = notArray.length;
        //^^Does not pass Case 2 "This is notnot"


        Integer numOfIs = 0;
        Integer numOfNot = 0;

        for (int i = 0; i < input.length()-3; i++) {

            if (input.substring(i,i+2).equalsIgnoreCase("is")){
                numOfIs++ ;
            }
            else if (input.substring(i,i+3).equalsIgnoreCase("not")){
                numOfNot++ ;
            }
        }
        return numOfIs.equals(numOfNot);
    }  //Doesn't pass Case 1 "This is not"

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean happyG = false;
        for (int i = 1; i < input.length()-1; i++) {
            if (input.charAt(i) == 'g')
                if (input.charAt(i - 1) == 'g' ||  input.charAt(i+1) =='g') {
                happyG = true;
                } else if (input.charAt(i - 1) != 'g'|| input.charAt(i+1) != 'g') {
                return false;
            }

        }
        return happyG;

    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int countTrip = 0;
        for (int i = 0; i <= input.length()-3 ; i++) {
            if (input.charAt(i) == input.charAt(i+1) && input.charAt(i) ==input.charAt(i+2)){
                countTrip++;
            }

        }
        return countTrip;
    }
}
