package simpleCalculations;

import java.util.Scanner;

public class TimeCalculations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());

        int minutes = hours * 60;

        int seconds = minutes * 60;

        System.out.println(hours + " timmar är " + minutes + " minuter eller " + seconds + " sekunder!");

    }
}
