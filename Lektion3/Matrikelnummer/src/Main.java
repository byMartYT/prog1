import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Matrikelnummer ein");

        String input = sc.next();

        if(input.equals("exit")) {
            return;
        }

        char[] inputChars = new char[]{input.charAt(0), input.charAt(1)};

        if(input.length() != 7){
            System.out.println("Keine Matrikelnummer");
            main(null);
        }
        if(inputChars[0] == '5' && (inputChars[1] == '1' || inputChars[1] =='0')) {
            success();
            main(null);
        } else if(inputChars[0] == '6' && inputChars[1] == '1') {
            success();
            main(null);
        }
        System.out.println("Keine Matrikelnummer");
        main(null);
    }

    public static void success() {
        System.out.println("Dies ist eine korrekte Matrikelnummer");
    }
}