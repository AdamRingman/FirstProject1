package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapTutorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> foodchoices = new HashMap<>();

        foodchoices.put("Pizza",10);
        foodchoices.put("Ärtsoppa",1);
        foodchoices.put("Nutella",5);
        foodchoices.put("Falukorv",8);

        System.out.println(foodchoices);
        System.out.println(foodchoices.get("Pizza"));

        foodchoices.remove("Nutella");
        foodchoices.clear();


        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
        "q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0",".",",","?"};
        //String[] morseCode = {"*-","-***","-*-*","-**","*","**-*","--*","****","**","*---",
        //"-*-",""};
        String[] morseCode = {
                "*-","-***","-*-*","-**","*","**-*","--*","****","**","*---","-*-","*-**",
                "--","-*","---","*--*","--*-","*-*","***","-","**-","***-","*--", "-**-",
                "-*--","--**","*----","**---","***--","****-","*****","-****","--***","---**",
                "----*","-----","*-*-*-","--**--","**--**"
        };

        HashMap<String, String> translateMorse = new HashMap<>();{
            for (int i = 0; i < letters.length; i++) {
                translateMorse.put(letters[i],morseCode[i]);
                translateMorse.put(morseCode[i],letters[i]);
            }

        }
        System.out.println("What letter do you want in morse?");
        System.out.println(translateMorse.get(scan.nextLine().toLowerCase()));
    }
}
