package simpleCalculations;

public class MeanValue
{
    public static void main(String[] args)
    {
        float numb1 = 3;
        float numb2 = 3;
        float numb3 = 2;
        float numbTotal = numb1 + numb2 + numb3;

        float meanValue = numbTotal/3;

        System.out.println("Totala summan av siffrorna vi valt är " + numbTotal + " och medelvärdet av siffrorna vi valt är " + meanValue);
    }
}
