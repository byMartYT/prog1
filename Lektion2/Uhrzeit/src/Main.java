import java.time.LocalTime;

public class Main {

    static final int MAX_SEC_OF_A_DAY = convertHrsToSec(24);

    static final boolean useLocalTime = false;

    static final int hrs = !useLocalTime ? 19 : LocalTime.now().getHour();
    static final int min = !useLocalTime ? 9 : LocalTime.now().getMinute();
    static final int sec = !useLocalTime ? 23 : LocalTime.now().getSecond();


    public static void main(String[] args) {

        int sekundenAmTag = 60*60*24;

        int sekunden = sec + min * 60 + hrs * 60 * 60;

        double ergebnis = sekundenAmTag - sekunden;

        System.out.println("Ergebnis: " + sekunden);


        /*if(useLocalTime) {
            System.out.printf("Es ist %d:%d:%d Uhr\n", hrs, min, sec);
        }

        System.out.println("Bereits vergangene Sekunden: " + secsSinceMidnight());

        System.out.println("Übrig bleibende Sekunden: " + leftSecs());

        System.out.println(percentage() + " des Tages sind bereits vergangen");*/
    }

    public static String percentage() {
        double result = (double) secsSinceMidnight() / (double) MAX_SEC_OF_A_DAY * 100d;
        String resultText = Double.toString(result);
        return resultText + " %";
    }

    public static int secsSinceMidnight() {
        int result = convertHrsToSec() + convertMinToSec() + sec;
        return result;
    }

    public static int leftSecs() {
        int result = (MAX_SEC_OF_A_DAY - secsSinceMidnight());
        return result;
    }

    // Hilfsmethoden
    public static int convertHrsToSec() {
        return hrs * 60 * 60;
    }

    public static int convertHrsToSec(int hours) {
        return hours * 60 * 60;
    }

    public static int convertMinToSec() {
        return min * 60;
    }

}
