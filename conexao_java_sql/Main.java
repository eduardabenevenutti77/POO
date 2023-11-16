import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("# -------------------------------------------------------- #");
            System.out.println("| Bem vindo(a) ao cadastro de usuários com JAVA ;)         |");
            System.out.println("| Selecione uma opção:                                     |");
            System.out.println("| \t\u001B[36m00\u001B[0m - Sair do Programa                              |");
            System.out.println("| \t\u001B[36m01\u001B[0m - Cadastrar Usuário                             |");
            System.out.println("| \t\u001B[36m02\u001B[0m - Alterar Usuário                               |");
            System.out.println("| \t\u001B[36m03\u001B[0m - Excluir Usuário                               |");
            System.out.println("| \t\u001B[36m04\u001B[0m - Visualizar Usuário                            |");
            System.out.println("| \t\u001B[36m05\u001B[0m - Cadastrar Mídia Digital                       |");
            System.out.println("# -------------------------------------------------------- #");
            System.out.print("\n => ");
            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Usuário: ");
                    String nomeCriar = sc.nextLine();
                    System.out.print("Email do Usuário: ");
                    String emailCriar = sc.nextLine();
                    System.out.print("Senha do Usuário: ");
                    String senhaCriar = sc.nextLine();

                    Entrada usuarioCriar = new Entrada(0, nomeCriar, emailCriar, senhaCriar);
                    usuarioCriar.inserirUsuario();
                break;

                case 2:
                    System.out.print("ID do usuário a ser alterado: ");
                    int idAlterar = sc.nextInt();

                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = sc.nextLine();
                    System.out.print("Nova senha: ");
                    String novaSenha = sc.nextLine();

                    Entrada usuarioAlterar = new Entrada(idAlterar, novoNome, novoEmail, novaSenha);
                    usuarioAlterar.atualizarUsuario();
                break;

                case 3:
                    System.out.print("ID do usuário a ser excluído: ");
                    int idExcluir = sc.nextInt();

                    Entrada usuarioExcluir = new Entrada(idExcluir, null, null, null);
                    usuarioExcluir.excluirUsuario();
                break;

                case 4:
                    Entrada.visualizarUsuarios();
                break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
