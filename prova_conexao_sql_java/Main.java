package prova_conexao_sql_java;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int op = 0;

            do {
                System.out.println("\n\n");
                System.out.println("# -------------------------------------------------------- #");
                System.out.println("| Bem vindo(a) ao sistema de gerenciamento de livros       |");
                System.out.println("| Selecione uma opção:                                     |");
                System.out.println("| \t\u001B[36m00\u001B[0m - Sair do Programa                              |");
                System.out.println("| \t\u001B[36m01\u001B[0m - Cadastrar Autor                               |");
                System.out.println("| \t\u001B[36m02\u001B[0m - Cadastrar Livro                               |");
                System.out.println("| \t\u001B[36m03\u001B[0m - Cadastrar Biblioteca                          |");
                System.out.println("| \t\u001B[36m04\u001B[0m - Cadastrar Mídia Digital                       |");
                System.out.println("| \t\u001B[36m06\u001B[0m - Incluir Livro/Midia D. na Biblioteca    |");
                System.out.println("| \t\u001B[36m07\u001B[0m - Emprestar Livro/Mídia Digital           |");
                System.out.println("| \t\u001B[36m08\u001B[0m - Devolver Livro/Mídia Digital            |");
                System.out.println("# -------------------------------------------------------- #");

                try {
                    op = sc.nextInt();
                } catch (Exception e) {
                    op = 100;
                }

                switch (op) {
                case 0:
                    System.out.println("\u001B[32mSaindo do programa :(\u001B[0m");
                break;

                case 1: //cadastro de autor
                System.out.println("\n\tCadastre um(a) autor(a) :)");
                System.out.println("\nInforme o nome do autor = ");
                String nomeAutor = sc.next();
                System.out.println("\nInforme o email do autor = ");
                String email = sc.next();
                System.out.println("\nInforme a nacionalidade = ");
                String nacionalidade = sc.next();
                new CadastroAutor(nomeAutor, email, nacionalidade);
                break;

                case 2: //cadastro de livro
                    System.out.println("\n\tCadastre um livro ;) ");
                    System.out.println("\nInforme título da obra = ");
                    String tituloLivro = sc.next();
                    int acharPosicaoAutor = -1;
                    do {
                        
                        System.out.println("Lista de Autores Disponíveis:");
                        for (int i = 0; i < CadastroAutor.nomeAutores.size(); i++) {
                            System.out.println(i + " - " + CadastroAutor.nomeAutores.get(i).getNome());
                        }
                        
                        try {
                            acharPosicaoAutor = sc.nextInt();
                            if (acharPosicaoAutor < 0 || acharPosicaoAutor >= CadastroAutor.nomeAutores.size()) {
                                System.out.println("Autor informado é inválido!");
                            }
                        } catch (Exception error) {
                            System.out.println("Autor informado é inválido!");
                            acharPosicaoAutor = -1;
                        }
                    } while (acharPosicaoAutor < 0);

                    CadastroAutor autorSelecionado = CadastroAutor.nomeAutores.get(acharPosicaoAutor);
                    CadastroAutor novoAutor = new CadastroAutor(nomeAutor, email, nacionalidade);
                    CadastroAutor.CadastroAutor();

                    
                    System.out.println("\nInforme o nome da editora = ");
                    String nomeEditora = sc.next();
                    System.out.println("Informe o e-mail da editora = ");
                    String emailEditora = sc.next();
                    System.out.println("Informe o CNPJ da editora = ");
                    int cnpj = sc.nextInt(); 
                    CadastrarEditora novaEditora = new CadastrarEditora(cnpj, nomeEditora, emailEditora);
                    CadastrarEditora.CadastrarEditora();  

                    
                    System.out.println("\nInforme o número do INSS");
                    int numeroINSS = sc.nextInt();
                    if (numeroINSS <= 0) {
                        System.out.println("\nO número informado é inválido!");
                        System.exit(0);
                    }

                    System.out.println("\nInforme a classificação do livro (drama, suspense, terror e etc) = ");
                    String classificacao = sc.next();

                    
                    CadastroLivro novoLivro = new CadastroLivro(tituloLivro, autorSelecionado, true, numeroINSS, classificacao);
                    CadastroLivro.CadastroLivro();  

                break;
            
                case 3: //criando a biblioteca
                    System.out.println("\nInforme o nome da biblioteca = ");
                    String nomeBiblioteca = sc.next();
                    new CadastrarBiblioteca(nomeBiblioteca);
                break;

                case 4: //cadastrando a mídia
                    System.out.println("\n\tCadastre mídia :)");
                    System.out.println("\nInforme o nome da mídia = ");
                    String nomMidia = sc.next();
                    System.out.println("\nInforme a classificação da mídia (romance, terror, suspense) = ");
                    String classificacaoMidia = sc.next();
                    new CadastrarMidia(nomMidia, false, classificacaoMidia);
                break;

                case 5: //cadastrando a mídia digital
                    System.out.println("\n\tCadastrar mídia digital ");
                    System.out.println("\nInfome o nome da mídia: ");
                    String nomeMidiaDigital = sc.next();
                    System.out.println("\nInforme o nome do cantor: ");
                    String nomeCantor = sc.next();
                    System.out.println("\nInforme a data de lançamento da mídia: ");
                    String data = sc.next();
                    System.out.println("\nInforme a classificação da mídia (sertanejo, pagode, samba, ..): ");
                    String tipo = sc.next();
                    new CadastrarMidiaDigital( nomeMidiaDigital, nomeCantor, data, false, tipo);
                    CadastrarMidiaDigital.classificacoes.toString();
                break;

                case 6: //incluir
                    System.out.println("\n\tIncluir livro/mídia/mídia digital na biblioteca ");
                    System.out.println("\nInforme qual objeto será inserido (1-Livro, 2-Mídia, 3-Mídia Digital): ");
                    int op_incluir = sc.nextInt();
                    if (op_incluir == 1) {
                        System.out.println("\nInforme a posição do livro: ");
                        int livro = sc.nextInt();
                        if (livro >= 0 && livro < CadastroLivro.livros.size()) {
                            CadastroLivro livros = CadastroLivro.livros.get(livro);
                            CadastrarBiblioteca.bibliotecas.get(livro).incluirLivro(livros);
                            System.out.println("Livro incluído na biblioteca com sucesso!!");
                        } else {
                            System.out.println("Posição do livro é inválida.");
                        }
                    }if (op_incluir == 2) {
                        System.out.println("\nInforme a posição da mídia: ");
                        int midia = sc.nextInt();
                        if(midia >= 0 && midia < CadastrarMidia.midias.size()){
                            CadastrarMidia midias = CadastrarMidia.midias.get(midia);
                            CadastrarBiblioteca.bibliotecas.get(midia).incluirMidia(midias);
                            System.out.println("A mídia foi incluída com sucesso!!");
                        }else{
                            System.out.println("Posição da mídia é inválida.");
                        }
                    } if(op_incluir == 3){
                        System.out.println("\nInforme a posição da mídia digital: ");
                        int digital = sc.nextInt();
                        if(digital >= 0 && digital < CadastrarMidiaDigital.digitais.size()){
                            CadastrarMidiaDigital digitais = CadastrarMidiaDigital.digitais.get(digital);
                            CadastrarBiblioteca.bibliotecas.get(digital).incluirDigital(digitais);
                            System.out.println("A mídia digital foi inclída com sucesso!!");
                        }else{
                            System.out.println("A posição da mídia digital é inválida.");
                        }
                    }
                break;

                case 7: //emprestar
                    System.out.println("\n\tEmprestar livros/mídias/mídias digitais");
                    System.out.println("\nInforme qual objeto será emprestado (1-Livro, 2- Mídia e 3- Mídia Digital): ");
                    int op_emprestimo = sc.nextInt();
                    if(op_emprestimo == 1){
                        int acharPosicaoBiblioteca_emprestar = -1;
                    do{
                        CadastrarBiblioteca.getBibliotecas();
                        try{
                            acharPosicaoBiblioteca_emprestar = sc.nextInt();
                            if(acharPosicaoBiblioteca_emprestar>=CadastrarBiblioteca.bibliotecas.size()){
                                throw new Exception("\nBiblioteca informada é inválida!!");
                            } 
                        }catch(Exception error){
                            System.out.println("\nA Biblioteca informada é inválida!");
                            acharPosicaoBiblioteca_emprestar = -1;
                        }
                        }while(acharPosicaoBiblioteca_emprestar<0);
                        CadastrarBiblioteca biblioteca_emprestar = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca_emprestar);
                        int acharPosicaoLivro_emprestar = -1;
                        do{
                            biblioteca_emprestar.getTitulo();
                            try {
                                acharPosicaoLivro_emprestar = sc.nextInt();
                                if (acharPosicaoLivro_emprestar >= CadastroLivro.livros.size()) {
                                    throw new Exception("\nO livro informado é inválido!");
                                }
                            } catch (Exception error) {
                                System.out.println("\nO livro informado é inválido!");
                                acharPosicaoLivro_emprestar = -1;
                            }
                        }while(acharPosicaoLivro_emprestar<0);
                        CadastroLivro livro_emprestar = CadastroLivro.livros.get(acharPosicaoLivro_emprestar);
                    try {
                        livro_emprestar.emprestarLivros();
                    } catch (Exception error){
                        System.out.println(error.getMessage());
                    }    
                    } if (op_emprestimo == 2) {
                        int acharPosicaoBiblioteca_emprestar = -1;
                        do{
                            CadastrarBiblioteca.getBibliotecas();
                            try{
                                acharPosicaoBiblioteca_emprestar = sc.nextInt();
                                if(acharPosicaoBiblioteca_emprestar>=CadastrarBiblioteca.bibliotecas.size()){
                                    throw new Exception("\nBiblioteca informada é inválida!!");
                                } 
                            }catch(Exception error){
                                System.out.println("\nA Biblioteca informada é inválida!");
                                acharPosicaoBiblioteca_emprestar = -1;
                            }
                        }while(acharPosicaoBiblioteca_emprestar<0);
                        CadastrarBiblioteca biblioteca_emprestar = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca_emprestar);
                        int acharPosicaoMidia_emprestar = -1;
                        do{
                            biblioteca_emprestar.getMidia();
                            try {
                                acharPosicaoMidia_emprestar = sc.nextInt();
                                if (acharPosicaoMidia_emprestar >= CadastrarMidia.midias.size()) {
                                    throw new Exception("\nA mídia informada é inválida!");
                                }
                            } catch (Exception error) {
                            System.out.println("\nA mídia informada é inválida");
                            acharPosicaoMidia_emprestar = -1;
                            }
                        }while(acharPosicaoMidia_emprestar<0);
                        CadastrarMidia midia_emprestar = CadastrarMidia.midias.get(acharPosicaoMidia_emprestar);
                        try {
                            midia_emprestar.emprestarMidia();
                        } catch (Exception error){
                            System.out.println(error.getMessage());
                        }
                    } if(op_emprestimo == 3) {
                        int acharPosicaoBiblioteca_emprestar = -1;
                        do{
                            CadastrarBiblioteca.getBibliotecas();
                            try{
                                acharPosicaoBiblioteca_emprestar = sc.nextInt();
                                if(acharPosicaoBiblioteca_emprestar>=CadastrarBiblioteca.bibliotecas.size()){
                                    throw new Exception("\nBiblioteca informada é inválida!!");
                                } 
                            }catch(Exception error){
                                System.out.println("\nA Biblioteca informada é inválida!");
                                acharPosicaoBiblioteca_emprestar = -1;
                            }
                        }while(acharPosicaoBiblioteca_emprestar<0);
                        CadastrarBiblioteca biblioteca_emprestar = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca_emprestar);
                        int acharPosicaoDigital_emprestar = -1;
                        do{
                            biblioteca_emprestar.getDigital();
                            try {
                                acharPosicaoDigital_emprestar = sc.nextInt();
                                if (acharPosicaoDigital_emprestar >= CadastrarMidiaDigital.digitais.size()) {
                                    throw new Exception("\nA mídia informada é inválida!");
                                }
                            } catch (Exception error) {
                                System.out.println("\nA mídia informada é inválida");
                                acharPosicaoDigital_emprestar = -1;
                            }
                        }while(acharPosicaoDigital_emprestar<0);
                        CadastrarMidiaDigital digital_emprestar = CadastrarMidiaDigital.digitais.get(acharPosicaoDigital_emprestar);
                            try {
                                digital_emprestar.emprestarDigital();
                            } catch (Exception error){
                                 System.out.println(error.getMessage());
                        }
                    }                                                                                                                                                                                                                                                                                                                                                                                                                             
                break;

                case 8: //devolver
                System.out.println("\n\tDevolução de livro/mídia/mídia digital");
                System.out.println("\n\tInforme qual objeto será devolvido (1- livro, 2- mídia e 3- mídia digital)");
                int op_devolver = sc.nextInt();
                if (op_devolver == 1) {
                    int acharPosicaoBiblioteca_devolver = -1;
                    do{
                        CadastrarBiblioteca.getBibliotecas();
                        try{
                            acharPosicaoBiblioteca_devolver = sc.nextInt();
                            if(acharPosicaoBiblioteca_devolver>=CadastrarBiblioteca.bibliotecas.size()){
                                throw new Exception("\nBiblioteca informada é inválida!!");
                            }
                        }catch(Exception error){
                        System.out.println("\nA Biblioteca informada é inválida!");
                        acharPosicaoBiblioteca_devolver = -1;
                        }   
                    }while(acharPosicaoBiblioteca_devolver<0);
                    CadastrarBiblioteca biblioteca_devolver = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca_devolver);
                    int acharPosicaoLivro_devolver = -1;
                    do{
                        biblioteca_devolver.getTitulo();
                        try{
                            acharPosicaoLivro_devolver = sc.nextInt();
                            if(acharPosicaoLivro_devolver>=CadastroLivro.livros.size()){
                                throw new Exception("\nO livro informado é inválido!!");
                            }
                        }catch(Exception error){
                            System.out.println("\nO livro informado é inválido!!");
                            acharPosicaoLivro_devolver = -1;
                        }
                    }while(acharPosicaoLivro_devolver<0);
                    CadastroLivro livro_devolver = CadastroLivro.livros.get(acharPosicaoLivro_devolver);
                    try {
                        livro_devolver.devolverLivro();
                    } catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                }if(op_devolver == 2){
                    int acharPosicaoBiblioteca_devolver = -1;
                    do{
                        CadastrarBiblioteca.getBibliotecas();
                        try{
                            acharPosicaoBiblioteca_devolver = sc.nextInt();
                            if(acharPosicaoBiblioteca_devolver>=CadastrarBiblioteca.bibliotecas.size()){
                                throw new Exception("\nBiblioteca informada é inválida!!");
                            }
                        }catch(Exception error){
                            System.out.println("\nA Biblioteca informada é inválida!");
                            acharPosicaoBiblioteca_devolver = -1;
                        }
                    }while(acharPosicaoBiblioteca_devolver<0);
                    CadastrarBiblioteca biblioteca_devolver = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca_devolver);
                    int acharPosicaoMidia_devolver = -1;
                    do{
                        biblioteca_devolver.getMidia();
                        try{
                            acharPosicaoMidia_devolver = sc.nextInt();
                            if(acharPosicaoMidia_devolver>=CadastroLivro.livros.size()){
                                throw new Exception("\nA mídia informada é inválida!!");
                            }
                        }catch(Exception error){
                            System.out.println("\nA mídia informada é inválida!!");
                            acharPosicaoMidia_devolver = -1;
                        }
                    }while(acharPosicaoMidia_devolver<0);
                    CadastrarMidia midia_devolver = CadastrarMidia.midias.get(acharPosicaoMidia_devolver);
                    try {
                        midia_devolver.devolverMidia();
                    } catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                } if (op_devolver == 3) {
                    int acharPosicaoBiblioteca_devolver = -1;
                    do{
                        CadastrarBiblioteca.getBibliotecas();
                        try{
                            acharPosicaoBiblioteca_devolver = sc.nextInt();
                                if(acharPosicaoBiblioteca_devolver>=CadastrarBiblioteca.bibliotecas.size()){
                                    throw new Exception("\nBiblioteca informada é inválida!!");
                                }
                        }catch(Exception error){
                        System.out.println("\nA Biblioteca informada é inválida!");
                        acharPosicaoBiblioteca_devolver = -1;
                        }
                    }while(acharPosicaoBiblioteca_devolver<0);
                    CadastrarBiblioteca biblioteca_devolver = CadastrarBiblioteca.bibliotecas.get(acharPosicaoBiblioteca_devolver);
                    int acharPosicaoDigital_devolver = -1;
                    do{
                        biblioteca_devolver.getDigital();
                        try{
                            acharPosicaoDigital_devolver = sc.nextInt();
                            if(acharPosicaoDigital_devolver>=CadastrarMidiaDigital.digitais.size()){
                                throw new Exception("\nA mídia digital informada é inválida!!");
                            }
                        }catch(Exception error){
                            System.out.println("\nA mídia digital informada é inválida!!");
                            acharPosicaoDigital_devolver = -1;
                        }
                    }while(acharPosicaoDigital_devolver<0);
                    CadastrarMidiaDigital digital_devolver = CadastrarMidiaDigital.digitais.get(acharPosicaoDigital_devolver);
                    try {
                        digital_devolver.devolverDigital();
                    } catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                }
                break;

                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        sc.close();
    }
}
