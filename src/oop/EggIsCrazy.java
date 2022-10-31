package oop;

import java.util.Scanner;

public class EggIsCrazy
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in din text och tryck enter!");
        String text = scan.nextLine();

        if(text.equals("ägg"))
        {
            System.out.println("ägg är knasigt");
        }
        else
        {
            for (int i = 0; i < text.length(); i++)
            {
                System.out.println(text.charAt(i));
            }
        }
    }
}
