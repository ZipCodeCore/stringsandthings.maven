package io.zipcoder;


import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
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
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public int countYZ(String input) {
        int count = 0;
        Pattern regex = Pattern.compile("[yz](?!\\p{L})", Pattern.CASE_INSENSITIVE);
        Matcher regexMatcher = regex.matcher(input);
        while (regexMatcher.find()) {
            count++;
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
        String res = base.replaceAll("(?i)" + remove, "");
        System.out.println(res);
        return res;
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
        ArrayList<String> isArrList = new ArrayList<>();
        ArrayList<String> notArrList = new ArrayList<>();
        boolean isEqual = false;
        String is = "is";
        String not = "not";

        for (int i = 0; i <= input.length() - 1; i++) {
            if (input.regionMatches(true, i, is, 0, is.length())) {
//                System.out.println("found is");
                isArrList.add("added");
            }
            if (input.regionMatches(true, i, not, 0, not.length())) {
//                System.out.println("found not");
                notArrList.add("added");
            }
        }
//        System.out.println("length of 'is' list= " + isArrList.size());
//        System.out.println("length of 'not' list= " + notArrList.size());
        if (isArrList.size() == notArrList.size()) {
            isEqual = true;
        }
        return isEqual;
    }


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return true
     */
    public Boolean gIsHappy(String input) {
        boolean outcome = false;
        String gg = "gg";
        for (int i = 0; i <= input.length(); i++) {
            if (input.regionMatches(true, i, gg, 0, gg.length())) {
                outcome = true;
            }
        }
        return outcome;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int len = input.length();
        int count = 0;

        for (int i = 0; i < len -2; i++) {
            if ((i < len) &&
                    input.charAt(i) == input.charAt(i + 1) &&
                    input.charAt(i) == input.charAt(i +2)) {
                count++;
            }
        }
        return count;
    }
}
