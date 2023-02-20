package assignment2;

import com.google.common.base.Ascii;

import java.util.HashMap;

public class MorseTranslate {

    private HashMap<String, Character> morseToEnglish = new HashMap<>();
    private HashMap<Character, String> englishToMorse = new HashMap<>();
    private Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '.', ',', '?'};
    private String[] morseCode = {
            "*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**",
            "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-",
            "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**",
            "----*", "-----", "*-*-*-", "--**--", "**--**"
    };
    private boolean activeProgram = true;

    public MorseTranslate() {
        initializeMap();
    }

    public void initializeMap() {
        for (int i = 0; i < letters.length; i++) {
            englishToMorse.put(letters[i], morseCode[i]);
            morseToEnglish.put(morseCode[i], letters[i]);
        }
    }

    public boolean loopIsActive() {
        return activeProgram;
    }

    public void setLoopInactive() {
        activeProgram = false;
    }

    public String engToMorse(String text) {
        Boolean containsFailedKey = false;
        String morseText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                morseText += " ";
            } else if (englishToMorse.containsKey(text.charAt(i))) {
                morseText += " " + englishToMorse.get(text.charAt(i));
            } else if (!englishToMorse.containsKey(text.charAt(i))) {
                throw new NullPointerException("Translation missing");
            }
        }
        return morseText;
    }

    public String morseToEng(String text) {
        String engText = "";
        String[] morse = text.split("\\s");
        for (int i = 0; i < morse.length; i++) {
            if (morse[i].equals("")) {
                engText += " ";
            } else if (morseToEnglish.containsKey(morse[i])) {
                engText += morseToEnglish.get(morse[i]);
            } else if (!morseToEnglish.containsKey(morse[i])) {
                throw new NullPointerException();
            }
        }
        return engText;
    }
}
