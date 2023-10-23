import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class recebendoInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        /* materalização da classe */
        int op = 0;
        do {
            System.out.println("\nMenu de opções: ");
            System.out.println("[1] Cadastrar Pessoa");
            System.out.println("[2] Imprimir informações");
            System.out.println("[3] Sair do programa");
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
                    System.out.println("\nCadastro de usuário!!");
                    System.out.println("\nInforme o nome: ");
                    String nome = sc.next();
                    System.out.println("\nInforme o peso: ");
                    double peso = sc.nextDouble();
                    System.out.println("\nInforme a altura: ");
                    double altura = sc.nextDouble();
                    System.out.println("\nInforme a data de nascimento: ");
                    String dataNasc = sc.next();
                    Pessoa objetoPessoa = new Pessoa(nome, peso, altura, dataNasc);
                    pessoas.add(objetoPessoa);
                    break;

                case 2:
                    for (Pessoa pessoa : pessoas) {
                        System.out.println("\nNome: " + pessoa.nome +
                                "\nPeso: " + pessoa.peso +
                                "\nAltura: " + pessoa.altura +
                                "\nData de Nascimento: " + pessoa.dataNasc +
                                "\nIMC: " + pessoa.calculoIMC() +
                                " Mensagem: " + pessoa.textoIMC());
                    }
                    break;

                case 3:
                    System.out.println("\nObrigado(a) por participar!!");
                    System.exit(op);
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
