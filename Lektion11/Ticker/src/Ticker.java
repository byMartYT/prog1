public class Ticker {

  char[] nachricht;

  public Ticker(int groesse) {
    if (groesse > 0) this.nachricht = new char[groesse];
    else this.nachricht = new char[200];
  }

  public int getGroesse() {
    return nachricht.length;
  }

  public char[] getNachricht() {
    return nachricht;
  }

  public void setNachricht(char[] nachricht) {
    if (this.nachricht.length > nachricht.length) {
      for (int i = 0; i < this.nachricht.length; i++) {
        try {
          this.nachricht[i] = nachricht[i];
        } catch (ArrayIndexOutOfBoundsException e) {
          this.nachricht[i] = '+';
        }
      }
    } else if (this.nachricht.length < nachricht.length) {
      for (int i = 0; i < this.nachricht.length; i++) {
        this.nachricht[i] = nachricht[i];
      }
    } else this.nachricht = nachricht;
  }

  public void resetNachricht(char c) {
    for (int i = 0; i < nachricht.length; i++) {
      nachricht[i] = c;
    }
  }

  public void resetNachricht() {
    for (int i = 0; i < nachricht.length; i++) {
      nachricht[i] = '+';
    }
  }

  public void rotateNachricht(int rotationLength) {
    char[] erg = new char[nachricht.length];
    for (int i = 0; i < nachricht.length; i++) {
      erg[i] = nachricht[(i + rotationLength) % nachricht.length];
    }

    nachricht = erg;
  }


}
