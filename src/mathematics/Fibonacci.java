package mathematics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        char morse1 = '*';
        char morse2 = '-';
        int c = morse1;
        int d = morse2;

        System.out.println(c + " " + d);

        Scanner scan = new Scanner(System.in);
        int[] fibonacci = new int[40];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 40; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        while (true) {
            System.out.println("Write the order of fibonacci you want:");

            int number = 0;
            boolean incorrectNumber = true;
            while (incorrectNumber) {
                try {
                    number = Integer.parseInt(scan.nextLine());
                    int result = fibonacci[number - 1];
                    System.out.print("This corresponds to: ");
                    System.out.println(result);
                    incorrectNumber = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("You wrote a number which is not between 1-40");
                } catch (NumberFormatException e) {
                    System.out.println("Please write a number");
                } catch (Exception oob) {
                    System.out.println("Something went wrong, please write a number between 1-40");
                }
            }
        }
    }
}
