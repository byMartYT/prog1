import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Stunden:");
        int hr = sc.nextInt();
        if(hr < 0 || hr > 23) {
            System.out.println("Keine gültige Stundeneingabe");
            return;
        }
        System.out.println("Minuten:");
        int min = sc.nextInt();

        if(min < 0 || min > 59) {
            System.out.println("Keine gültige Minuteneingabe");
            return;
        }
        System.out.println("Sekunden:");
        int sec = sc.nextInt();
        if(sec < 0 || sec > 59) {
            System.out.println("Keine gültige Sekundeneingabe");
            return;
        }
        System.out.printf("%s:%s:%s",hr,min,sec);
    }

}