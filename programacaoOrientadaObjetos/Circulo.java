public class Circulo {
  public int raio;

  public Circulo(int raio) {
    this.raio = raio;
  }

  public double calculoCirco() {
    return 3.14 * (raio * 2);
  }
}
