package oop;

public class FruitSalad
{
    public static void main(String[] args)
    {
        Fruit grape = new Fruit("Grape", "Purple");
        Fruit banana = new Fruit("banana", "Yellow");
        Fruit pear = new Fruit("Pear","Green");

        grape.printFruitColor();
        banana.printFruitColor();
        pear.printFruitColor();
    }
}
