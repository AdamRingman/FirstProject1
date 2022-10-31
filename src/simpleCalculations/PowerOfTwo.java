package simpleCalculations;

import java.util.Scanner;

public class PowerOfTwo {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in siffran du vill beräkna kvadrat på.");

        int number = Integer.parseInt(scan.nextLine());

        int square = number * number;

        System.out.println("Kvadraten av " + number + " är " + square);


    }

}
