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
    public Integer countYZ(String input) {
        // convert to a string
        String[] newInput = input.split(" ");
            //start count at 0
            int count = 0;
            //Go through each element of the array
            for(int i = 0; i < newInput.length; i++){
                //String words is equal to element i
                String word = newInput[i];
                //lastChar is equal to the last words
                char lastChar = word.charAt(word.length()-1);
                if(lastChar == 'z' || lastChar == 'y'){
                //if(newInput.charAt(newInput.length) == 'y' || newInput.charAt(newInput.length) == 'z'){
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
        //Find the string that needs to be remove
        String removedWords = base.replaceAll(remove,"");
        return removedWords;
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
        // Count the number of times "is" is in the sentence
        int is = countString(input,"is");
        int not = countString(input, "not");

        return is == not;
        //same as above
//        if(is == not){
//            return true;
//        }else{
//            return false;
//        }

    }

    public Integer countString(String input, String value){
        int count = 0;
        for(int i = 0; i < input.length();i++){
            // i being where they will start from. first loop will start at 0, second loop start at index 1, etc
            if(input.startsWith(value,i)){
                count++;
            }
        }
        return count;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return false
     */
    public Boolean gIsHappy(String input) {
        int index = 0;
        //Find the index with the element g
        while(true){
            // find the index with the character g
            index = input.indexOf('g', index);
            //if the index is -1, it means there is no g making the statement false. get out of the loop
            if(index == -1){
                break;
            }
            //find the element at index index
            char g = input.charAt(index);
            //give the next index a variable
            int nextIndex = index + 1;
            //find the element at the next index to g
            char twinG = input.charAt(nextIndex);
            //if the character next to g is not g, return false
            if (twinG != g) {
                return false;
            }
            //after finding the g, we want to start looking for the next g which would be 2 index away from the previous g
            index = index + 2;

        }
        return true;

//        xxggxx
//        for (int i = 1; i < input.length() - 1; i++) {
//           //check if the current char is a g
//            if(input.charAt(i) == 'g') {
//                //check if the next or the previous character is g
//                    if (input.charAt(i + 1) != 'g' && input.charAt(i - 1) != 'g') {
//                        return false;
//                    }
//
//            }
//
//
//        }
//
//        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;
        //if the element index == index + 1 ==index + 2, count++
        for(int i= 0; i < input.length(); i++){
            char letter = input.charAt(i);
            if(letter == input.charAt(i+1) && letter == input.charAt(i+2)){
              count++;
            }
        }
        return count;
    }
}
