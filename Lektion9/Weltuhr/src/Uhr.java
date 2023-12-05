public class Uhr {
  private int hr;
  private int min;
  private int sec;

  public Uhr(int hr, int min, int sec) {
    if ((hr < 0 || hr > 23) || (min < 0 || min > 59) || (sec < 0 || sec > 59)) {
      this.hr = 12;
      this.min = 0;
      this.sec = 0;
    } else {
      this.hr = hr;
      this.min = min;
      this.sec = sec;
    }
  }

  public void setUhr(int hr, int min, int sec) {
    if ((hr < 0 || hr > 23) || (min < 0 || min > 59) || (sec < 0 || sec > 59)) {
      System.out.println("Wrong Format!");
    } else {
      this.hr = hr;
      this.min = min;
      this.sec = sec;
    }
  }

  void nextSec() {
    if(++sec == 60) {
      sec = 0;
      if(++min == 60) {
        min = 0;
        if(++hr == 24) {
          hr = 0;
          min = 0;
          sec = 0;
        }
      }
    }
  }

  public int getHr() {
    return hr;
  }

  public int getMin() {
    return min;
  }

  public int getSec() {
    return sec;
  }
}
