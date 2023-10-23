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
        Integer noOfWords = 0;
        String[] words = input.split("\\s");
        for (String word : words) {
            if (word.charAt(word.length() - 1) == ('y') || word.charAt(word.length() - 1) == 'z') ;
            noOfWords += 1;

        }

        return noOfWords;
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

        String removedString = base.replace(remove, "");

        return removedString;
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


        int isCount = 0;
        int notCount = 0;
       // isCount = StringUtils.countMatches(input, "is");
       // notCount = StringUtils.countMatches(input, "not");
        String findStr = "is";
        int lastIndex = 0;

        while (lastIndex != -1) {

            lastIndex = input.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                isCount++;
                lastIndex += findStr.length();
            }
        }

        lastIndex = 0;
        findStr = "not";
        while (lastIndex != -1) {

            lastIndex = input.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                notCount++;
                lastIndex += findStr.length();
            }
        }

        if ( isCount == notCount) return true;
        else return false;


    }



    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input)
    {

    int gisNotHappy = 0;

    for ( int i=0; i< input.length() ; i++  )
    {

        if (input.charAt(i) == 'g' && input.charAt(i+1) == 'g' )
        {
            i+= 2;

        }
        else if (input.charAt(i) == 'g' && input.charAt(i+1) != 'g' )
        {
            gisNotHappy++;
        }

    }
    if (gisNotHappy > 0)
        return false;
    else return true;

    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input)
    {

        int count = 0;
        for ( int i=0; i< input.length() ; i++  )
        {

            char findChar = input.charAt(i);
            if (i < input.length()- 2) //should not check for last 2 chars in the string
            {
                if (input.charAt(i + 1) == findChar && input.charAt(i + 2) == findChar)
                {
                    count += 1;

                }
            }

        }


        return count;
    }
}
