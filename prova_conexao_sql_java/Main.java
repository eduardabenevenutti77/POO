package prova_conexao_sql_java;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int op = 0;
 
        do {
            System.out.println("\n\n");
            System.out.println("# -------------------------------------------------------- #");
            System.out.println("| Bem vindo(a) ao sistema de gerenciamento de livros |");
            System.out.println("| Selecione uma opção: |");
            System.out.println("| \t\u001B[36m00\u001B[0m - Sair do Programa |"); 
            System.out.println("| \t\u001B[36m01\u001B[0m - Cadastrar Autor |");
            System.out.println("| \t\u001B[36m02\u001B[0m - Cadastrar Livro |");
            System.out.println("| \t\u001B[36m03\u001B[0m - Cadastrar Biblioteca |");
            System.out.println("| \t\u001B[36m04\u001B[0m - Cadastrar Mídia Digital|");
            System.out.println("| \t\u001B[36m05\u001B[0m - Cadastrar Editora |");
            System.out.println("| \t\u001B[36m06\u001B[0m - Listar Autor |");
            System.out.println("| \t\u001B[36m07\u001B[0m - Listar Livro |");
            System.out.println("| \t\u001B[36m08\u001B[0m - Listar Biblioteca |");
            System.out.println("| \t\u001B[36m09\u001B[0m - Listar Mídia Digital |");
            System.out.println("| \t\u001B[36m09\u001B[0m - Listar Editoras |");
            System.out.println("# -------------------------------------------------------- #");
            try {
                op = sc.nextInt();
            } catch (Exception e) {
                op = 99;
            }
 
            switch (op) {
                case 0: {
                    System.out.println("Sair....");
                    break;
                }
                case 1: { // criar autor
                    System.out.println("Informe o nome do autor = ");
                    String nome = sc.next();
                    System.out.println("Informe o e-mail = ");
                    String email = sc.next();
                    System.out.println("Informe o nacionalidade = ");
                    String nacionalidade = sc.next();
                    new CadastroAutor(nome, email, nacionalidade);
                    break;
                }
 
                case 2: { // criar livro
                    System.out.println("Informe o título do livro = ");
                    String titulo = sc.next();
                    System.out.println("Informe o nome do autor do livro = ");
                    CadastroAutor nome = sc.next();
                    System.out.println("Informe o número do livro = ");
                    int num = sc.nextInt();
                    System.out.println("Informe a classificação do livro = ");
                    String classi = sc.next();
                    new CadastroLivro(titulo,nome, false, num, classi);
                }

                case 3: { //criar biblioteca
                    System.out.println("Informe o nome da biblioteca =");
                    String nomeBiblioteca = sc.next();
                    new CadastrarBiblioteca(nomeBiblioteca);
                    break;
                }

                case 4: { // midia digital
                    System.out.println("Informe o título da mídia digital = ");
                    String nomeMidia = sc.next();
                    System.out.println("\nInforme o nome do cantor = ");
                    String cantor = sc.next();
                    System.out.println("\nInforme a data de lançamento (yyyy/month/day) = ");
                    String data = sc.next();
                    System.out.println("\nInforme o nome do album = ");
                    String album = sc.next();
                    new CadastrarMidiaDigital(nomeMidia, cantor, data, true, album);
                    break;
                }
 
                case 5: { //criar biblioteca
                    System.out.println("Informe o nome da editora =");
                    String nome = sc.next();
                    System.out.println("\nInforme o e-mail da editora = ");
                    String email = sc.next();
                    System.out.println("\nInforme o CNPJ da editora = ");
                    int cnpj = sc.nextInt();
                    new CadastrarEditora(cnpj, nome, email);
                    break;
                }
                case 6: {
                    CadastroAutor.listarAutor();
                    break;
                }
                case 7: {
                    CadastroLivro.listarLivro();
                    break;
                }
                case 8: {
                    CadastrarBiblioteca.listarBiblioteca();
                    break;
                }
                case 9: {
                    CadastrarMidiaDigital.listarMidiaDigital();
                    break;
                }
                case 10: {
                    CadastrarEditora.listarEditora();
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        sc.close();
    }
}