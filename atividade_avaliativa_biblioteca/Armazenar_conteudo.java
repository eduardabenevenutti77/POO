import java.util.Scanner;

public class Armazenar_conteudo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int op = 0;
        do{
            System.out.println("# ---------------------------------------------------------- #");
            System.out.println("| Bem vindo(a) ao sistema de gerenciamento de livros         |");
            System.out.println("| Selecione uma opção:                                       |");
            System.out.println("| \t\u001B[36m00\u001B[0m - Sair do Programa                                |");
            System.out.println("| \t\u001B[36m01\u001B[0m - Cadastrar Autor                                 |");
            System.out.println("| \t\u001B[36m02\u001B[0m - Cadastrar Livro                                 |");
            System.out.println("| \t\u001B[36m03\u001B[0m - Cadastrar Biblioteca                            |");
            System.out.println("| \t\u001B[36m04\u001B[0m - Cadastrar Mídia                                 |");
            System.out.println("| \t\u001B[36m05\u001B[0m - Cadastrar Mídia Digital                         |");
            System.out.println("| \t\u001B[36m06\u001B[0m - Incluir Livro na Biblioteca                     |");
            System.out.println("| \t\u001B[36m07\u001B[0m - Incluir Mídia na Biblioteca                     |");
            System.out.println("| \t\u001B[36m08\u001B[0m - Incluir Mídia Digital na Biblioteca             |");
            System.out.println("| \t\u001B[36m09\u001B[0m - Emprestar Livro/Mídia/Mídia Digital             |");
            System.out.println("| \t\u001B[36m10\u001B[0m - Devolver Livro/Mídia/Mídia Digital              |");
            System.out.println("# ---------------------------------------------------------  #");

            try {
                op = sc.nextInt();
            } catch (Exception e) {
                op = 100;
            }
            switch (op) {
                case 0:
                    System.out.println("\u001B[32mSaindo do programa :(\u001B[0m");
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
             }
        } while (op != 0);
        sc.close();
    }
}