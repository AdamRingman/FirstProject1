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
        myText.textInput("Hej hej hallå :)");
        myText.textInput("Vad händer?");

        int actual = myText.amountOfLines();
        int expected = 4;

        assertEquals(expected, actual);
    }
    @Test
    public void testLongestWord(){
        TextRead myText = new TextRead();
        myText.textInput("God kväll!");
        myText.textInput("Godmorgon");
        myText.textInput("    space    ");

        String actual = myText.longestWord();
        String expected = "Godmorgon";

        assertEquals(expected, actual);
    }
}
