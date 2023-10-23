import java.util.Scanner;

public class Cifra {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a mensagem: ");
    String mensagemOriginal = sc.nextLine();

    System.out.print("Digite o valor constante: ");
    int valorConstante = sc.nextInt();

    Cesar cifra = new Cesar(mensagemOriginal, valorConstante);
    String mensagemCifrada = cifra.criptografar();

    System.out.println("Mensagem cifrada: " + mensagemCifrada);
  }
}
