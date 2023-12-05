import java.util.Scanner;

public class Main {
    static final double FALLCONST = 9.80665;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte Falldauer in Sekunden eingeben:");
        double time = sc.nextInt();

        for(int i = 1; i <= time; i++){
            if((i-1)%5 != 0) {
                continue;
            }
            double res = (0.5 * FALLCONST * Math.pow(i, 2));
            System.out.printf("Zeit: %s Sekunden -> Zurückgelegte Strecke: %s m%n",i, res);
            Thread.sleep(1000);
        }
    }
}