public class Raum {
  private String name;
  private boolean belegt;
  private int max;

  private Student[] students;

  public Raum(String name, boolean belegt, int max) {
    this.name = name;
    this.belegt = belegt;
    this.max = max;
    this.students = new Student[max];
  }
  public void join(Student st) {
    System.out.println(students.length);
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        students[i] = st;
        System.out.println("Willkommen in " + name);
        if (i == students.length-1) {
          belegt = true;
        }
        return;
      }
    }

    System.out.println("Der Raum ist voll");
  }

  public void test() {
    System.out.println(students[0]);
    System.out.println(students[0] == null);
    System.out.println(students[0].equals(null));
  }

  public void printStudents() {
    System.out.println("Raum: " + name);
    for (Student st : students) {
      try {
      System.out.println("Name: " + st.getName() + " Mat: " + st.getMat());
      } catch (NullPointerException e) {
      }
    }
    System.out.println("Belegung: " + (belegt ? "Voll" : "Frei"));
  }

  public void leave(Student st) {
    for (int i = 0; i < students.length; i++) {
      if (students[i].equals(st)) {
        students[i] = null;
        System.out.println("Bis Bald");
        belegt = false;
        return;
      }
    }
    System.out.println("Der Student ist nicht in diesem Raum");
  }

  public void setBelegt(boolean belegt) {
    this.belegt = belegt;
  }

  public String getName() {
    return name;
  }

  public boolean isBelegt() {
    return belegt;
  }


}
