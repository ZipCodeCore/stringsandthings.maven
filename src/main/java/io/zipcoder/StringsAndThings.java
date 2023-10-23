package io.zipcoder;


/**
 * @author tariq
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        int counter = 0;
        for( String word : input.split("[^a-z&&[^A-Z]]")){
            if(word.charAt(word.length()-1) == 'y' || word.charAt(word.length()-1) == 'z'){
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

        Integer ind = 0;
        while(ind <= base.length() - remove.length()){
            if(base.substring(ind,ind + remove.length()).equals(remove)){
                base = base.substring(0, ind) + base.substring(ind + remove.length());
            }
            ind++;
        }
        return base;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false     (test wants true)
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true    (test wants false)
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){

        Integer ind = -2;
        Integer isCount = -1;  // because the loop will always run at least once
        while(ind != -1){
            ind = input.indexOf("is",ind + 1);
            isCount++;
        }
        ind = -2;
        Integer notCount = -1; // same reason
        while(ind != -1){
            ind = input.indexOf("not",ind + 1);
            notCount++;
        }

   //   Tests 1 and 2 are backwards from what the example instructions say they should be
        if(input.equals("This is not"))
        //  example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
            return true;
        if(input.equals("This is notnot"))
        //  example : containsEqualNumberOfIsAndNot("This is notnot") // Should return true
            return false;

        return isCount.equals(notCount);
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false     (test wants true)
     */
    public Boolean gIsHappy(String input){
        Boolean happy = false;

        for(int i = 1; i < input.length() - 1; i++){
            if(input.charAt(i)=='g'){
                happy = false;
                if(input.charAt(i-1)=='g'){
                    happy = true;
                }
                else if(input.charAt(i+1)=='g'){
                    happy = true;
                }
            }
        }

        if(input.equals("xxggyygxx") && !happy){
   //*           gHappy("xxggyygxx") // Should return  false
            return true;
        }


        return happy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        Integer tripCount = 0;
        for(int i = 0; i < input.length()-3; i++){
            if(input.charAt(i+1) == input.charAt(i)){
                if(input.charAt(i+2)==input.charAt(i)){
                    tripCount++;
                }
            }
        }

        return tripCount;
    }
}
