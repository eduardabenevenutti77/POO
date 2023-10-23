public class ContaBanco {

  public int numero;
  public int agencia;
  // public double saldo;
  public String nome;
  public double valor;

  public ContaBanco(int numero, int agencia, String nome, double valor) {
    this.numero = numero;
    this.agencia = agencia;
    this.nome = nome;
    this.valor = valor;
  }

  // métodos
  public double deposito() {
    double valorInicial = 15980;
    return (valorInicial + this.valor);
  }

  public double saque() {
    double valorInicial = 15980;
    return (valorInicial - this.valor);
  }

  public double saldoTotal() {
    double valorInicial = 15980;
    return valorInicial;
  }
}
