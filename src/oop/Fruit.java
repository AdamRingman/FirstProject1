package oop;

public class Fruit
{
    private String type;
    private String color;
    public Fruit(String fruitType, String fruitColor)
    {
        color = fruitColor;
        type = fruitType;
    }
    public void printFruitColor()
    {
        System.out.println("Your fruit " + type.toLowerCase() + " is " + color.toLowerCase());
    }
}
