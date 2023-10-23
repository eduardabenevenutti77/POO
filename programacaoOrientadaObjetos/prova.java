import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prova {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int contOti = 0;
        int contBom = 0;
        int contSatis = 0;
        int contInsat = 0;
        System.out.println("Prova de Java!!");
        System.out.println("Aluna: Maria Eduarda Benevenutti");
        System.out.println("Data: 28/08/2023");
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Queue<String> incluirAluno = new LinkedList<>();
        float[] conceitos = new float[4];
        do{
            System.out.println("\n\t Sistema de gerenciamento escolar \n");
            System.out.println("\u001B[32m");
            System.out.println("[1] - Incluir aluno & conceito | Exibir os alunos com o conceito mais alto ");
            System.out.println("[2] - Listar alunos e conceitos armazenados");
            System.out.println("[3] - Calcular e exibir a quantidade de cada conceito");
            System.out.println("[4] - Finalizar o programa");
            System.out.println("\u001B[0m");
            System.out.println("\nQual atividade deseja executar? ");

            try{
                opcao = sc.nextInt();
            }catch (InputMismatchException e){
                opcao = -1;
                sc.next();
            }
            switch (opcao){
                case 0:
                System.out.println("Obrigado!!");
                break;

                case 1:
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mInserir aluno\u001B[0m");
                for(int i=0;i<4;i++){
                    System.out.println("\nInforme o nome do aluno: ");
                    String nomeAluno = sc.next();
                    incluirAluno.add(nomeAluno);
                    System.out.println("\nInforme o conceito do aluno em notas- O(10.0)|B(8.0)|S(7.0)|I(6.0): ");
                    conceitos[i] = sc.nextFloat();
                    if(conceitos[i]==10.0){
                        contOti++;
                        System.out.println(nomeAluno+" possui conceito Ótimo!!!");
                    }if (conceitos[i]==8.0) {
                        contBom++;
                    } if(conceitos[i]==7.0) {
                        contSatis++;
                    } if(conceitos[i]==6.0){
                        contInsat++;
                    }
                    System.out.println("\n\u001B[33m" + nomeAluno + "\u001B[0m foi incluido como o conceito " + conceitos[i] + " na fila");
                }
                System.out.println("\n---------------------------------");
                break;

                case 2:
                for(String listarAluno: incluirAluno){
                    System.out.println("\nAluno: "+listarAluno);
                }
                for(float listarConceitos: conceitos){
                    System.out.println("\nConceitos: "+listarConceitos);
                }
                break;

                case 3:
                /*Mostra a quantidade de conceitos: ótimos, bons, satisfatório e insatisfatório */
                System.out.println("\nExistem "+contOti+" conceitos Otimos");
                System.out.println("\nExistem "+contBom+" conceitos Bons");
                System.out.println("\nExistem "+contSatis+" conceitos Satisfatórios");
                System.out.println("\nExistem "+contInsat+" conceitos Insatifatórios");
                break;


                case 4:
                continuar = false;
                System.out.println("\n\u001B[31mO sistema está sendo encerrado!\u001B[0m");
                System.exit(0);
                break;
    
                default:
                System.out.println("Opção inválida!!");
                break;
            }
        }  while(opcao != 0);
        sc.close();
}
}
