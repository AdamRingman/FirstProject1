package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapTutorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

        HashMap<String, String> morseToEng = new HashMap<>();
        HashMap<String, String> engToMorse = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            engToMorse.put(letters[i],morseCode[i]);
            morseToEng.put(morseCode[i],letters[i]);
        }
        System.out.println("What letter do you want in morse?");
        System.out.println(engToMorse.get(scan.nextLine().toLowerCase()));
    }
}
