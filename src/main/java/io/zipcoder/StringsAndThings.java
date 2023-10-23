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
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int counter=0;
        input+=" ";
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)==' ')
                {
                    char condition=input.charAt(i-1);
                    if(condition=='y' || condition=='Y'
                      || condition=='z' || condition=='Z')
                    {
                        counter++;

                    }
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
    //"(?i)" is given to deal with the case insenstive
    //This is called in the front of the regular expression.
            return base.replaceAll("(?i)"+remove, "");
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
        int count1=0;
        int count2=1;
        if(input.toLowerCase().contains("is") &&input.toLowerCase().contains("not")){
            //The split method returns an array of matching string parts. So basically it's splitting a string
            // with the substring that we want to find and check how many array elements it has returned.
            count1 = ( input.split("is", -1).length ) - 1;
            count2 = ( input.split("not", -1).length ) - 1;
        }
        if (count1==count2)
        return true;
        else return false;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        for(int i=0;i<input.length();i++){
            if (input.charAt(i)==('g')) {
                if(input.charAt(i-1)=='g' || input.charAt(i+1)=='g'){
                    return true;
                }
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
        int totalCount=0;
        int occurence=0;
        for(int i=0;i<input.length();i++)
        {
            for (int j=i;j<input.length();j++)
            {
                if (input.charAt(j) == input.charAt(i)) {
                    occurence++;
                }
            }
            if(occurence>=3) {
                totalCount=1+(occurence%3);
            }
        }
        return totalCount;
    }
}
