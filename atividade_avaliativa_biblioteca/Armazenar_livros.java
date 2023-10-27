import java.util.ArrayList;
import java.util.Scanner;

public class Armazenar_livros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do {
            System.out.println("\n\tBem vindo(a) ao sistema de cadastramento de livros em Java ;)\n");
            System.out.println("\nSelecione 1ª opção: ");
            System.out.println("0 - Sair do sistema");
            System.out.println("1 - Cadastrar autor");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Cadastrar biblioteca");
            System.out.println("4 - Incluir livro");
            System.out.println("5 - Emprestar livro");
            System.out.println("6 - Devolver livro");
            try {
                op = sc.nextInt();
            } catch (Exception e) {
                op = 100;
            }

            switch (op) {
            case 0:
                System.out.println("\nVocê está saindo do sistema!");
            break;

            case 1:
               System.out.println("\nInforme o nome do autor = ");
               String nomeAutor = sc.next();
               System.out.println("\nInforme o email do autor = ");
               String email = sc.next();
               System.out.println("\nInforme a nacionalidade = ");
               String nacionalidade = sc.next();
               new CadastroAutor(nomeAutor, email, nacionalidade);
            break;

            case 2:
                System.out.println("\nInforme título da obra = ");
                String tituloLivro = sc.next();
                int acharPosicaoAutor = -1;
                do {
                    CadastroAutor.listarAutores();
                    try {
                        acharPosicaoAutor = sc.nextInt();
                        ArrayList<CadastroAutor> autores = CadastroAutor.getNomeAutores();
                        if (acharPosicaoAutor >= autores.size()) {
                            System.out.println("\nO autor informado é inválido!");
                        }
                    } catch (Exception error) {
                        System.out.println("\nO autor informado é inválido!");
                        acharPosicaoAutor = -1;
                    }
                } while (acharPosicaoAutor < 0);
                CadastroAutor nomeAutor_cadastrar = CadastroAutor.nomeAutores.get(acharPosicaoAutor);

                System.out.println("\nInforme o nome da editora = ");
                String nomeEditora = sc.next();
                System.out.println("Informe o e-mail da editora = ");
                String email_editora = sc.next();
                System.out.println("\nInforme o CNPJ da editora = ");
                int cnpj = sc.nextInt();
                int acharPosicaoEditora = -1;
                do{
                    CadastrarEditora.listarEditoras();;
                    try{
                        acharPosicaoEditora = sc.nextInt();
                        if(acharPosicaoEditora >=CadastrarEditora.editoras.size()){
                            throw new Exception("\nA editora é inválida!");
                        }
                    }catch(Exception error){
                        System.out.println("\nA editora é inválida");
                        acharPosicaoEditora = -1;
                    }
                } while(acharPosicaoEditora<0);
                CadastrarEditora editora_cadastrar = CadastrarEditora.editoras.get(acharPosicaoEditora);

                System.out.println("\nInforme o número do INSS");
                int numeroINNS = sc.nextInt();
                if(numeroINNS<0){
                    System.out.println("\nO número informado é inválido!");
                    System.exit(0);
                }

                System.out.println("\nInforme a classificação do livro (drama, suspense, terror e etc) = ");
                String classificacao = sc.next();
                int acharPosicaoClassificacao = -1;
                do{
                    CadastrarClassificacao.listarClassificacoes();
                    try{
                        acharPosicaoClassificacao = sc.nextInt();
                        if(acharPosicaoClassificacao>=CadastrarClassificacao.classificacoes.size()){
                            throw new Exception("\nA classficação informada não é válida!");
                        }
                    }catch(Exception error){
                        System.out.println("\nA classificação informada é inválida!");
                        acharPosicaoClassificacao = -1;
                    }
                }while(acharPosicaoClassificacao<0);
                CadastrarClassificacao classificacao_cadastrar = CadastrarClassificacao.classificacoes.get(acharPosicaoClassificacao);
                new CadastroLivro(tituloLivro, nomeAutor_cadastrar, true, numeroINNS, classificacao);
                new CadastrarEditora(cnpj, nomeEditora, email_editora);
            break;
            
            case 3:
                System.out.println("\nInforme o nome da biblioteca = ");
                String nomeBiblioteca = sc.next();
                new CadastrarBiblioteca(nomeBiblioteca);
            break;

            case 4:
                int acharPosicaoBiblioteca = -1;
                do{
                    CadastrarBiblioteca.imprimirBibliotecas();
                    try{
                        acharPosicaoBiblioteca = sc.nextInt();
                        if (acharPosicaoBiblioteca >= CadastrarBiblioteca.bibliotecas.size()) {
                            throw new Exception("\nA biblioteca informada é inválida!");
                            
                        }
                    }catch (Exception error){
                        System.out.println("\nA biblioteca informada é inválida!");
                        acharPosicaoBiblioteca = -1;
                    }
                }while(acharPosicaoBiblioteca<0);

                CadastrarBiblioteca biblioteca = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca);
            
            int acharPosicaoLivro = -1;
            do{
                CadastroLivro.listarLivros();
                try{
                    acharPosicaoLivro = sc.nextInt();
                    if(acharPosicaoLivro >= CadastroLivro.livros.size()){
                        throw new Exception("\nO livro informado é inválido!");
                    }
                }catch(Exception error){
                    System.out.println("\nO livro informado é inválido!");
                    acharPosicaoLivro =-1;
                }
            }while(acharPosicaoLivro<0);
                CadastroLivro  livro = CadastroLivro.livros.get(acharPosicaoLivro);
                break;

                // case 5:
                //     int acharPosicaoBiblioteca_emprestar = -1;
                //     do{
                //         CadastrarBiblioteca.imprimirBibliotecas();
                //         try{
                //             acharPosicaoBiblioteca_emprestar = sc.nextInt();
                //             if(acharPosicaoBiblioteca_emprestar>=CadastrarBiblioteca.bibliotecas.size()){
                //                 throw new Exception("\nBiblioteca informada é inválida!!");
                //             } 
                //         }catch(Exception error){
                //             System.out.println("\nA Biblioteca informada é inválida!");
                //             acharPosicaoBiblioteca_emprestar = -1;
                //         }
                //         }while(acharPosicaoBiblioteca_emprestar<0);

                //         CadastrarBiblioteca biblioteca_emprestar = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca);

                //     int acharPosicaoLivro_emprestar = -1;
                //     do{
                //         biblioteca.imprimirLivros();
                //         try {
                //             acharPosicaoLivro_emprestar = sc.nextInt();
                //             if (acharPosicaoLivro_emprestar >= CadastroLivro.livros.size()) {
                //                 throw new Exception("\nO livro informado é inválido!");
                //             }
                //         } catch (Exception error) {
                //             System.out.println("\nO livro informado é inválido!");
                //             acharPosicaoLivro_emprestar = -1;
                //         }
                //     }while(acharPosicaoLivro_emprestar<0);

                //     CadastroLivro livro_emprestar = CadastroLivro.livros.get(acharPosicaoLivro_emprestar);
                //     try {
                //         livro.emprestarLivros();
                //     } catch (Exception error){
                //         System.out.println(error.getMessage());
                //     }
                // break;

                // case 6:
                // int acharPosicaoBiblioteca_devolver = -1;
                // do{
                //     CadastrarBiblioteca.imprimirBibliotecas();
                //     try{
                //         acharPosicaoBiblioteca_devolver = sc.nextInt();
                //         if(acharPosicaoBiblioteca_devolver>=CadastrarBiblioteca.bibliotecas.size()){
                //             throw new Exception("\nBiblioteca informada é inválida!!");
                //         }
                //     }catch(Exception error){
                //             System.out.println("\nA Biblioteca informada é inválida!");
                //             acharPosicaoBiblioteca_devolver = -1;
                //         }
                //     }while(acharPosicaoBiblioteca_devolver<0);

                //     CadastrarBiblioteca biblioteca_devolver = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca_devolver);

                // int acharPosicaoLivro_devolver = -1;
                // do{
                //     CadastroLivro.listarLivros();
                //     try{
                //         acharPosicaoLivro_devolver = sc.nextInt();
                //         if(acharPosicaoLivro_devolver>=CadastroLivro.livros.size()){
                //             throw new Exception("\nO livro informado é inválido!!");
                //         }
                //     }catch(Exception error){
                //         System.out.println("\nO livro informado é inválido!!");
                //         acharPosicaoLivro_devolver = -1;
                //     }
                // }while(acharPosicaoLivro_devolver<0);

                // CadastroLivro livro_devolver = CadastroLivro.livros.get(acharPosicaoLivro_devolver);

                // try {
                //     classificacao.devolverLivro();
                // } catch (Exception error) {
                //     System.out.println(error.getMessage());
                // }
                // break;

                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        sc.close();
    }
}