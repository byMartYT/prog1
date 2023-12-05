import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if(primzahl(input)) {
            System.out.println("Untersuchte Zahl ist eine Primzahl!");
        } else {
            System.out.println("Untersuchte Zahl ist keine Primzahl!");
        }


        for(int i = input; i > 1; i--) {
            if(primzahl(i)) {
                System.out.println(i);
            }
        }


    }

    public static boolean primzahl(int number) {
        boolean prim = true;
        if(number == 1) return false;
        for(int i = number-1; i > 1; i--) {
            if(number % i == 0) {
                prim = false;
                break;
            }
        }
        if(prim) {
            return true;
        } else {
            return false;
        }
    }
}