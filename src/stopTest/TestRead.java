package stopTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestRead {
    @Test
    public void testCharacterCalculation(){
        List<String> myList = new ArrayList<String>();
        myList.add("Godmorgon!");
        myList.add("God kväll!");

        TextRead myText = new TextRead(myList);
        int actual = myText.amountOfCharacters();
        int expected = 19;

        assertEquals(expected, actual);
    }
    @Test
    public void testLineCalculation(){
        List<String> myList = new ArrayList<String>();
        myList.add("Godmorgon!");
        myList.add("God kväll!");

        TextRead myText = new TextRead(myList);
        int actual = myText.amountOfLines();
        int expected = 2;

        assertEquals(expected, actual);
    }
}
