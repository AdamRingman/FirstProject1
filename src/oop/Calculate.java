package oop;

import java.util.Scanner;

public class Calculate
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in talen du vill beräkna med varandra");
        Calculator first = new Calculator(Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine()));



        first.printAddition();
        first.printSubtract();
        first.printDivide();
        first.printMultiply();
    }
}
