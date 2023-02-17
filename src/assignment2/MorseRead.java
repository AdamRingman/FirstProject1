package assignment2;
import java.util.Scanner;

public class MorseRead {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseTranslate translate = new MorseTranslate();

        while(translate.loopIsActive()){
            System.out.println("Välkommen till morse kod översättaren!" +
                    "\n Välj på vilket håll du vill översätta morse kod" +
                    "\n" +
                    "\n 1. Engelska till Morsekod" +
                    "\n 2. Morsekod till Engelska" +
                    "\n 3. Stäng programmet");
            int input = Integer.parseInt(scan.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Skriv din engelska text som du vill översätta");
                    System.out.println("Översättningen på din text är: " + translate.engToMorse(scan.nextLine().toLowerCase()));
                    scan.nextLine();
                    break;
                case 2:
                    System.out.println("Skriv din morse text som du vill översätta");
                    System.out.println("Översättningen på din morse är: " + translate.morseToEng(scan.nextLine()));
                    scan.nextLine();
                    break;
                case 3:
                    translate.setLoopIsActive();
                    break;
            }
        }
    }
}
