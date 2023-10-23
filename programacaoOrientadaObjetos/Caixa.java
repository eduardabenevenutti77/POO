import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Caixa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<ContaBanco> contas = new ArrayList<ContaBanco>();
    int op = 0;

    do {
      System.out.println("\n\tMenu de opções: ");
      System.out.println("[1] Acessar conta");
      System.out.println("[2] Verificar Saldo");
      System.out.println("[3] Realizar Depósito");
      System.out.println("[4] Realizar Saque");

      try {
        op = sc.nextInt();
      } catch (InputMismatchException e) {
        op = -1;
        sc.next();
      }

      switch (op) {
        case 0:
          System.out.println("Obrigado!!");
          break;

        case 1:
          System.out.println("\nInforme o número da conta: ");
          int numero = sc.nextInt();
          System.out.println("\nInforme o número da agência: ");
          int agencia = sc.nextInt();
          System.out.println("\nInforme o nome do títular: ");
          String nome = sc.next();
          System.out.println("\nInforme o valor: ");
          double valor = sc.nextDouble();

          ContaBanco objetoContaBanco = new ContaBanco(numero, agencia, nome, valor);
          contas.add(objetoContaBanco);
          break;

        case 2:
          for (ContaBanco conta : contas) {
            System.out.println("\nNome: " + conta.nome +
                "\nAgência: " + conta.agencia +
                "\nNúmero conta: " + conta.numero +
                "\nOperação: Visualizar saldo" + "\nSaldo:" + conta.saldoTotal());
          }
          break;

        case 3:
          for (ContaBanco conta : contas) {
            System.out.println("\nNome: " + conta.nome +
                "\nAgência: " + conta.agencia +
                "\nNúmero conta: " + conta.numero +
                "\nOperação: Depósito" + "\nSaldo:" + conta.deposito());
          }
          break;

        case 4:
          for (ContaBanco conta : contas) {
            System.out.println("\nNome: " + conta.nome +
                "\nAgência: " + conta.agencia +
                "\nNúmero conta: " + conta.numero +
                "\nOperação: Saque" + "\nSaldo:" + conta.saque());
          }
          break;
      }
    } while (op != 0);
    sc.close();
  }
}
