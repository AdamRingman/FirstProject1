package stopTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestRead {
    @Test
    public void testCharacterCalculation(){
        TextRead myText = new TextRead();
        myText.textInput("Godmorgon!");
        myText.textInput("God kväll!");

        int actual = myText.amountOfCharacters();
        int expected = 19;

        assertEquals(expected, actual);
    }
    @Test
    public void testLineCalculation(){
        TextRead myText = new TextRead();
        myText.textInput("Godmorgon!");
        myText.textInput("God kväll!");

        int actual = myText.amountOfLines();
        int expected = 2;

        assertEquals(expected, actual);
    }
}
