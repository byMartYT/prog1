import java.util.Scanner;

public class Main {
    static Raum[] raums = new Raum[]{
            new Raum("I.2.1", false, 3),
            new Raum("I.2.15", false, 50)};
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student[] st = {new Student("Tome"), new Student("Max"), new Student("Martin"), new Student("Thomas")};
    raums[0].join(st[0]);
    raums[0].join(st[1]);
    raums[0].join(st[2]);

    sc.next();

    raums[0].printStudents();

    sc.next();

    raums[0].join(st[3]);

    sc.next();

    raums[0].leave(st[0]);

    raums[0].printStudents();
    sc.next();

    raums[0].join(st[3]);
    raums[0].printStudents();

  }

  public static void print() {
    for(Raum r : raums) {
      System.out.println("Name: " + r.getName() + " ist " + (r.isBelegt() ? "belegt" : "frei"));
    }
  }
}