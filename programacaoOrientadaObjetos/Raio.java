import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Raio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Circulo> circulos = new ArrayList<Circulo>();

    System.out.println("\nInforme o valor do raio: ");
    int raio = sc.nextInt();
    Circulo objetoCirculo = new Circulo(raio);
    circulos.add(objetoCirculo);

    for (Circulo circulo : circulos) {
      System.out.println("\nRaio: " + circulo.raio +
          "\nÁrea: " + circulo.calculoCirco());
    }
  }
}