package simpleCalculations;

import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv i cm hur lång bredden på rektangeln är");
        int width = Integer.parseInt(scan.nextLine());

        System.out.println("Skriv i cm hur lång längden på rektangeln är");
        int length = Integer.parseInt(scan.nextLine());

        int rectangleArea = width * length;
        int rectangleCircum = (width * 2) + (length * 2);

        System.out.println("Rektangelns area är " + rectangleArea + " och omkretsen är " + rectangleCircum);
    }
}
