package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class CountYZTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }

    @Test
    public void countYZTest1(){
        String input = "fez day";
        Integer expected = 2;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countYZTest2(){
        String input = "day fez";
        Integer expected = 2;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void countYZTest3 (){
        String input = "day fyyyz";
        Integer expected = 2;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countYZTest4 (){
        String input = "freaky friendly friday ";
        Integer expected = 3;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void countYZTest5 (){
        String input = "day bay way hey bazz fizz buzz ditz";
        Integer expected = 8;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);

    }
}
