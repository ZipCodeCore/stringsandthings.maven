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


        String strArr[] = input.split(" ");
        String yz = "";
        Integer count = 0;
        for (String strThing : strArr) {
            if (strThing.charAt(strThing.length() - 1) == 'y' || (strThing.charAt(strThing.length() - 1)) == 'z') {
                count++;
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


        return base.replaceAll(remove, "");
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

        String input1 = input.replace("is", "7");
        String input2 = input.replace("not", "5");
        Integer count1 = 0;
        Integer count2 = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == '7') {
                count1++;
                //System.out.println(count1);
            }
        }
        for (int j = 0; j < input2.length(); j++) {
            if (input2.charAt(j) == '5') {
                count2++;

            }
        }
        System.out.println(count1);
        System.out.println(count2);

        return count1 == count2;


    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

        int count = 0;
        for (Integer i = 1; i < input.length() - 1; i++) {

            if (input.charAt(i) == 'g')
                if(input.charAt(i - 1) == 'g' || input.charAt(i + 1) == 'g') {
                continue;
            }   else    {
                count++;
            }
            }
        if(count == 0)    {
                return true;
            } return false;

    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        Integer count = 0;
        for (Integer i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == input.charAt(i + 1)) && (input.charAt(i) == input.charAt(i + 2))) {
                count++;
            }

        } return count;
    }


}
