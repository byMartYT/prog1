import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte Zeichen eingeben!:");
        String input = sc.next();
        char inputToChar = input.charAt(0);
        char inputToChar2 = (char) System.in.read();
        int charCode = inputToChar;
        System.out.println(inputToChar2);

        sc.close();


        // Großbuchstabe -> 65 - 90
        // Hexadezimale Ziffer A-F a-f 0-9
        // Binäre Ziffer -> 0 1 (48 49)
        // Oktale Ziffer -> 0-7

        // Else if -> unbekannt

        boolean treffer = false;
        if(charCode >= 65 && charCode <= 90) {
            System.out.println("Großbuchstabe");
            treffer = true;
        }
        if((charCode >= 65 && charCode <= 70) || (charCode >= 97 && charCode <= 102) || (charCode >= 48 && charCode <= 57)) {
            System.out.println("Hexadezimale Ziffer");
            treffer = true;
        }
        if(charCode == 48 || charCode == 49) {
            System.out.println("Binäre Ziffer");
            treffer = true;
        }
        if(charCode >= 48 && charCode <= 55) {
            System.out.println("Oktale Ziffer");
            treffer = true;
        }
        if(!treffer) System.out.println("Unbekannt");


    }
}