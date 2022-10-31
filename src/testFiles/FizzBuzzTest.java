package testFiles;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest
{
    @Test
    public void test2get2()
    {
        FizzBuzz fb = new FizzBuzz();

        int testdata = 3;
        String expected = "Fizz";

        String actual = fb.getFizzBuzz(testdata);

        assertEquals(expected, actual);
    }




}
