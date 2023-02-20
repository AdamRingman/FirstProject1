package assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestMorse {
    @Test
    public void testEngToMorse() {
        MorseTranslate translate = new MorseTranslate();

        String actual = translate.engToMorse("Hello there Steve".toLowerCase());
        String expected = " **** * *-** *-** ---  - **** * *-* *  *** - * ***- *";

        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToEng() {
        MorseTranslate translate = new MorseTranslate();

        String actual = translate.morseToEng("**** * *-** *-** ---  - **** * *-* *  *** - * ***- *");
        String expected = "hello there steve";

        assertEquals(expected, actual);
    }

    @Test
    public void testWrongInputMenu() {
        MorseTranslate translate = new MorseTranslate();

        Exception exception = assertThrows(Exception.class, () ->
                translate.engToMorse("Hello there Steve!"));

        assertEquals("Translation missing", exception.getMessage());
    }

    @Test
    public void testStopFunction() {
        MorseTranslate translate = new MorseTranslate();

        translate.setLoopInactive();
        Boolean actual = translate.loopIsActive();
        Boolean expected = false;

        assertEquals(expected, actual);
    }
}
