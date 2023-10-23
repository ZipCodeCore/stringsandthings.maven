package io.zipcoder;


import com.sun.deploy.util.StringUtils;

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
        String phrase[] = input.split(" ");
        int counter = 0;
        for (int i = 0; i < phrase.length; i++) {
            if (phrase[i].charAt(phrase[i].length() - 1) == 'y' || phrase[i].charAt(phrase[i].length() - 1) == 'z') {
                counter++;
            }
        }
        return counter;
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
        return base.replaceAll(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return true
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return false
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int countIs = 0;
        int countNot = 0;
        char[] charArray = input.toCharArray();

        char i = 'i';
        char s = 's';
        char n = 'n';
        char o = 'o';
        char t = 't';

        for (int count = 0; count < charArray.length - 1; count++) {
            if (charArray[count] == i && charArray[count + 1] == s) {
                countIs++;
            }
            if (charArray[count] == n && charArray[count +1] == o && charArray[count +2] == t) {
                countNot++;
            }
        }
        return countIs == countNot;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        char z = 'g';
        char[]  happyG = input.toCharArray();
        boolean happy = false;
        for (int i = 0; i < happyG.length; i++){
            if (happyG[i] == z && happyG[i + 1] == z){
                happy = true;
            }
            else if (happyG[i] == z && happyG[i - 1] != z){
                happy = false;
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
        char[] tri = input.toCharArray();
        int count = 0;
        for (int i = 0; i < tri.length - 1; i++){
            if(tri[i + 1] == tri[i] && tri[i + 2] == tri[i]){
                count++;
            }
        }
        return count;
    }
}
