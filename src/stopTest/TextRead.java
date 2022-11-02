package stopTest;

public class TextRead {
    private String text = "";
    private int amountOfLines = 0;
    private int amountOfWords = 1;
    private Boolean active = true;

    public boolean loopIsActive() {
        return active;
    }

    public void textInput(String inputText) {
        if (inputText.toLowerCase().equals("stop")) {
            active = false;
        } else {
            text += " " + inputText;
            amountOfLines++;
        }
    }

    public int amountOfLines() {
        return amountOfLines;
    }

    public int amountOfCharacters() {
        int characters = 0;
        for (int i = 0; i < text.length(); i++) {
            int asciiNumber = text.charAt(i);
            if (asciiNumber != 32) {
                characters++;
            }
        }
        return characters;
    }

    public int amountOfWords() {
        String trimText = text.trim();
        if (trimText.isEmpty()) {
            return 0;
        } else {
            return trimText.split("\\s+").length;
        }
    }

    public String longestWord() {
        String longWord = "";
        String[] word = text.split("\\s+");
        for (int i = 0; i < word.length; i++) {
            if(word[i].length() > longWord.length()){
                longWord = word[i];
            }
        }
        return longWord;
    }
}
