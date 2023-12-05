public class Main {
    public static void main(String[] args) throws InterruptedException{
        int startTime = 15;

        for(int i = startTime; i >= 0; i--) {
            System.out.println(startTime);
            startTime--;
            Thread.sleep(1000);
        }
    }
}