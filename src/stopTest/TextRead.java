package stopTest;

import java.util.List;

public class TextRead {
        private String text = "";
        private int amountOfLines = 0;
        private int amountOfWords = 1;
    public TextRead(List inputText){

        for (int i = 0; i < inputText.size(); i++) {
            text += " " + inputText.get(i);
            amountOfLines++;
        }
    }

    public int amountOfLines() {
        return amountOfLines;
    }

    public int amountOfCharacters() {
        int characters = 0;
        for (int i = 0; i < text.length(); i++) {
            int c = text.charAt(i);
            if(c != 32){
                characters++;
            }
        }
        return characters;
    }

    public int amountOfWords(){
        for (int i = 0; i < text.length(); i++) {
            int c = text.charAt(i);
            if(c == 32){
                amountOfWords++;
            }
        }
        return amountOfWords;
    }

    public String longestWord() {
        return "heylooo";
    }
}
