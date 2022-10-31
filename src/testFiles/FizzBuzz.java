package testFiles;

public class FizzBuzz
{
    public String getFizzBuzz(int testData)
    {
        String data = null;
        switch (testData)
        {
            case 1, 2:
                data = "Buzz";
                break;
            case 3:
                data = "Fizz";
                break;
        }
        return data;
    }
}
