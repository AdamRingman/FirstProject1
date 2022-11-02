package stopTest;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TextRead text = new TextRead();

        while (text.loopIsActive()) {
            System.out.println("Write your text, type 'stop' when done");
            text.textInput(scan.nextLine());
        }

        System.out.println("Du har skrivit " + text.amountOfCharacters() + " tecken och " + text.amountOfLines() + " rader");
        System.out.println("Antal ord som skrevs var " + text.amountOfWords() + " st och det längsta ordet var " + text.longestWord());
    }
}
