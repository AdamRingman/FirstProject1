package assignment2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MorseRead {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseTranslate translate = new MorseTranslate();

        while (translate.loopIsActive()) {
            System.out.println("""
                    Välkommen till morse kod översättaren!
                     Välj på vilket håll du vill översätta morse kod

                     1. Engelska till Morsekod
                     2. Morsekod till Engelska
                     3. Stäng programmet""");
            try {
                int input = Integer.parseInt(scan.nextLine());
                switch (input) {
                    case 1:
                        System.out.println("Skriv din engelska text som du vill översätta");
                        System.out.println("Översättningen på din text är:" + translate.engToMorse(scan.nextLine().toLowerCase()));
                        System.out.println("Tryck enter för att komma tillbaks till menyn");
                        scan.nextLine();
                        break;
                    case 2:
                        System.out.println("Skriv din morse text som du vill översätta");
                        System.out.println("Översättningen på din text är:" + translate.morseToEng(scan.nextLine()));
                        System.out.println("Tryck enter för att komma tillbaks till menyn");
                        scan.nextLine();
                        break;
                    case 3:
                        translate.setLoopInactive();
                        break;
                    default:
                        System.out.println("Något gick fel, försök igen");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ditt meddelande innehöll något annat än siffror");
                System.out.println("Tryck enter för att komma tillbaks till menyn");
                scan.nextLine();
            } catch (NullPointerException e) {
                System.out.println("Ditt meddelande innehöll en karaktär som inte kunde översättas, försök igen");
                System.out.println("Tryck enter för att komma tillbaks till menyn");
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Något gick fel, försök igen");
                System.out.println("Tryck enter för att komma tillbaks till menyn");
                scan.nextLine();
            }
        }
    }
}
