package oop;

import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BankAccount balance = new BankAccount();
        Boolean programActive = true;
        Boolean loggedIn = false;
        while (!loggedIn && programActive)
        {
            System.out.println("Välkommen användare, tryck på enter för att logga in på ditt konto!");
            scan.nextLine();
            loggedIn = true;
            while(loggedIn)
            {
                System.out.println(
                        "Välj ditt val ur menyn" +
                        "\n 1. Kolla ditt saldo" +
                        "\n 2. Bestäm nytt värde på ditt saldo" +
                        "\n 3. Lägg in pengar på ditt konto" +
                        "\n 4. Ta ut pengar från ditt konto" +
                        "\n 5. Logga ut och stäng av"
                );
                int input = Integer.parseInt(scan.nextLine());
                switch (input)
                {
                    case 1: //Kolla ditt saldo
                        System.out.println("Ditt saldo är: " + balance.readBalance() +
                        "\n Tryck enter för att gå tillbaka till menyn");
                        scan.nextLine();
                        break;
                    case 2: //Bestäm nyy värde på ditt saldo
                        System.out.println("Skriv in hur mycket ditt saldo ska vara");
                        balance.setBalance(Integer.parseInt(scan.nextLine()));
                        break;
                    case 3: //Bestäm nytt värde på ditt saldo
                        System.out.println("Skriv in hur mycket pengar du har laggt in");
                        int addAmount = Integer.parseInt(scan.nextLine());
                        balance.addBalance(addAmount);
                        break;
                    case 4: //Lägg in pengar på ditt konto
                        System.out.println("Skriv in hur mycket pengar du vill ta ut");
                        int withdrawAmount = Integer.parseInt(scan.nextLine());
                        if((balance.readBalance() >= withdrawAmount))
                        {
                            balance.withdrawBalance(withdrawAmount);
                            break;
                        }
                        else
                        {
                            System.out.println("Du försöker ta ut mer pengar än du har, välj en annan summa");
                        }
                    case 5: //Logga ut och stäng av
                        loggedIn = false;
                        programActive = false;
                        break;
                    default:
                        System.out.println("Något blev fel med din inmatning, försök igen!");
                        break;
                }
            }
        }
    }

}
