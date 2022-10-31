package oop;

import java.util.Scanner;

public class Calculator
{
    private double numb1;
    private double numb2;

    public Calculator(int number1, int number2)
    {
        numb1 = number1;
        numb2 = number2;
    }

    public void printAddition()
    {
        System.out.println("Addition av dina tal blir " + (numb1 + numb2));
    }
    public void printSubtract()
    {
        System.out.println("Subtraktion av dina tal blir " + (numb1 - numb2));
    }
    public void printDivide()
    {
        System.out.println("Dividering av dina tal blir " + (numb1/numb2));
    }
    public void printMultiply()
    {
        System.out.println("Multiplicering av dina tal blir " + (numb1*numb2));
    }

}
