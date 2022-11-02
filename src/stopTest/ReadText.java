package stopTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> textList = new ArrayList<String>();
        Boolean active = true;

        while (active) {
            System.out.println("Write your text");
            String input = scan.nextLine();
            if (input.toLowerCase().equals("stop")) {
                active = false;
            } else {
                textList.add(input);
            }
        }
        TextRead text = new TextRead(textList);
        System.out.println("Du har skrivit " + text.amountOfCharacters() + " tecken och " + text.amountOfLines() + " rader");
        System.out.println("Antal ord som skrevs var " + text.amountOfWords() + " st och det längsta ordet var " + text.longestWord());
    }
}
