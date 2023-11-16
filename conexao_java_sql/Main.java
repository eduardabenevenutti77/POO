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
                    String name = sc.nextLine();
                    System.out.print("Email do Usuário: ");
                    String email = sc.nextLine();
                    System.out.print("Senha do Usuário: ");
                    String password = sc.nextLine();

                    Entrada cadastrarUsuario = new Entrada(0, name, email, password);
                    cadastrarUsuario.cadastrar();
                break;

                case 2:
                    System.out.print("Número de identificação do usuário: ");
                    int id = sc.nextInt();

                    System.out.print("Novo nome: ");
                    String newName = sc.nextLine();
                    System.out.print("Novo email: ");
                    String newEmail = sc.nextLine();
                    System.out.print("Nova senha: ");
                    String newPassword = sc.nextLine();

                    Entrada alterarUsuario = new Entrada(id, newName, newEmail, newPassword);
                    alterarUsuario.alterar();
                break;

                case 3:
                    System.out.print("Número de identificação do usuário: ");
                    int id_deletar = sc.nextInt();

                    Entrada deletarUsuario = new Entrada(id_deletar, null, null, null);
                    deletarUsuario.deletar();
                break;

                case 4:
                    Entrada.mostrar();
                break;

                default:
                    System.out.println("A opção informada é inválida! Insira outro valor ;)");
            }
        }
    }
}
