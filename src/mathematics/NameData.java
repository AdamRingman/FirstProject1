package mathematics;

import java.util.Scanner;

public class NameData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = {"Ada", "Beda", "Calle"};

        System.out.println("Vilket namn i listan vill du hämta?");
        boolean boolActive = true;
        while(boolActive){
            int number = 0;
            try {
                number = Integer.parseInt(scan.nextLine());
                String chosenName = names[number - 1];
                System.out.println("Number " + number + " in the list is " + chosenName);
                boolActive = false;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("The list does not contain a name with your number, try again");
            }
            catch (NumberFormatException e){
                System.out.println("Can not find a number, try again");
            }
            catch (Exception oob){
                System.out.println("Something went wrong, try again");
            }
        }
    }
}
