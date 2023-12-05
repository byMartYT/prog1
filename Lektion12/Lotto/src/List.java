public class List {

    static Node start = null;
    static Node ziehung = null;

    public static void main(String[] args) {

        generate();
        ziehen();
        print();
    }

    public static void ziehen() {
        if (start != null) {
            for (int i = 0; i < 6; i++) {
                Node n = null;
                while(n == null) {
                    n = start.ziehen();
                }
                addZiehung(new Node(n.number));
                start.delete(n);
            }
        }
    }

    public static void generate() {
        for (int i = 1; i <= 49; i++) {
            add(i);
        }
    }

    public static void add(int number) {
        if (start != null) {
            start.add(new Node(number));
        } else {
            start = new Node(number);
        }
    }


    public static void addZiehung(Node n) {
        if(ziehung != null) {
            ziehung = ziehung.insert(n);
        } else {
            ziehung = n;
        }
    }

    public static void print() {
        if (ziehung != null) ziehung.print();
        else System.out.println("Die Liste ist leer");
    }
}