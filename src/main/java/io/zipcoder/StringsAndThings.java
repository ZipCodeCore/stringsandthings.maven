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
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int count = 0;
        String[] arrayOfWords = input.split(" ");
        for(String word : arrayOfWords) {
            int numberOfCharInWord = word.length();
            int lastIndex = numberOfCharInWord - 1;
            char lastChar = word.charAt(lastIndex);
            if(lastChar == 'y' || lastChar == 'z'){
                count++;
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
        String deleteString = "";
        if(base.contains(remove)){
            deleteString = base.replace(remove, "");
        } else deleteString = base;
        return deleteString;
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
        //search for occurrences of "is" and "not" in string
        //remove the string of letters so it does not repeat
        //tally the number of occurrences for each

        int numberOfIs = 0;
        int numberOfNot = 0;
        String currentString = input;
        int indexOf = currentString.indexOf("not");

        while(indexOf >= 0){
            currentString = currentString.replaceFirst("not", "");
            indexOf = currentString.indexOf("not");
            numberOfNot++;
        }

        indexOf = currentString.indexOf("is");
        while(indexOf >= 0){
            currentString = currentString.replaceFirst("is", "");
            indexOf = currentString.indexOf("is");
            numberOfIs++;
        }
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


        boolean indexIsG = false;
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g') {
                if (input.charAt(i + 1) == 'g' || input.charAt(i -1) == 'g') {
                    indexIsG = true;
                } else if (input.charAt(i+1) != 'g'){
                    indexIsG = false;
                    break;
                } else if (input.charAt(i - 1) != 'g'){
                    indexIsG = false;
                    break;
                }
            }
        }
        return indexIsG;
    }


     /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple (String input){
        int numberOfTriples = 0;
        //loop through string
        //find if charAt(i) == charAt(i+1) and (i+2)
        //increase counter by 1

        for(int i = 0; i < input.length() - 3; i++){
            if(input.charAt(i) == input.charAt(i+1)){
                if(input.charAt(i+1) == input.charAt(i+2)){
                    numberOfTriples++;
                }
            }
        }

        return numberOfTriples;
    }
}
