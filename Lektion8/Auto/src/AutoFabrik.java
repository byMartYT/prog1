import java.util.ArrayList;

public class AutoFabrik {
  public int produzierteAutos;
  ArrayList<Auto> autos = new ArrayList<>();

  public void produziere(Auto a) {
    autos.add(a);
    produzierteAutos++;
  }

  public void printCount(){
    System.out.println(produzierteAutos);
  }


}
