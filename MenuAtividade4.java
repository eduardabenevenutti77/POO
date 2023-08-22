import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuAtividade4 {
    public static void main(String[] args){
        System.out.println("Atividades de Java!!");
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("\n\t Lista 02 \n");
            System.out.println("\u001B[32m");
            System.out.println("[1] - Atividade 01");
            System.out.println("[2] - Atividade 02");
            System.out.println("[3] - Atividade 03");
            System.out.println("[4] - Atividade 04");
            System.out.println("[5] - Atividade 05");
            System.out.println("[6] - Atividade 06");
            System.out.println("[7] - Atividade 07");
            System.out.println("[8] - Atividade 08");
            System.out.println("[9] - Atividade 09");
            System.out.println("[10] - Atividade 10");
            System.out.println("[11] - DESAFIO");
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
                System.out.println("\n\t\u001B[32mCalcule a tabuada de um valor informado pelo usuário\u001B[0m");
                /*1) Crie um programa que questione a quantidade de notas a ser informada, 
                receba as notas e calcule a média.*/
                int acum_notas=0;
                System.out.println("\nInforme a quantidade de notas a serem verificadas: ");
                int quntdNotas = sc.nextInt();
                float nota[] = new float[quntdNotas];
                for(int i=0;i<quntdNotas;i++){
                    System.out.println("\nInforme a "+(i+1)+"ª nota: ");
                    nota[i] = sc.nextFloat();
                    acum_notas += nota[i];
                }
                float media = acum_notas/quntdNotas;
                System.out.println("\nA média do estudante: "+media);
                System.out.println("\n---------------------------------");
                break;

                case 2:
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mLista de compras\u001B[0m\n");
                /*2) Crie um programa que imprima um arrays com Foreach*/
                String[] compras = {"abobrinha","alho","pipoca","cenoura","tomate","pimentão","feijão","arroz","suco de laranja","bolacha"};
                for(String comida:compras){
                    System.out.println(comida);
                }
                System.out.println("\n---------------------------------");
                break;

                case 3:
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mInforme valores double e salve em um array\u001B[0m");
                /*3) Crie um programa que leia 10 valores double e salve em um array, 
                depois imprima esses valores.*/
                double[] valores = new double[10];
                for(int i=0;i<10;i++){
                    System.out.println("\nInforme o "+(i+1)+"º valor em double: ");
                    valores[i] = sc.nextDouble();
                }
                System.out.println("\n******************");
                for(double mostraTela:valores)
                System.out.println("\n"+mostraTela);
                System.out.println("\n---------------------------------");
                break;
                
                case 4:
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mLeia 10 valores em inteiro e salve em um array\u001B[0m");
                /*4) Crie um programa que leia 10 valores int e salve em um array, 
                depois imprima se esses valores são pares ou ímpares*/
                int[] valor = new int[10];
                for(int i=0;i<10;i++){
                    System.out.println("\nInforme o "+(i+1)+"º valor: ");
                    valor[i] = sc.nextInt();
                    if(valor[i]%2==0){
                    System.out.println("O valor é par.");
                    }else{
                    System.out.println("O valor é ímpar.");
                    }
                }

                System.out.println("\n---------------------------------");
                break;

                case 5:
                
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mReceba um String\u001B[0m");
                /*5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, 
                imrpima elas.*/
                System.out.println("\n---------------------------------");  
                break;

                case 6:
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mJunte duas listas de valores inteiros\u001B[0m");
                /*6) Crie um programa que una duas listas de inteiros*/
                ArrayList<Integer> number1 = new ArrayList<Integer>();
                number1.add(100);
                number1.add(0);
                number1.add(55);
                number1.add(777);
                ArrayList<Integer> number2 = new ArrayList<Integer>();
                number2.add(500);
                number2.add(5400);
                number2.add(5);
                number2.add(10000);
                System.out.println("\n\u001B[32mAntes de juntar as listas:\u001B[0m ");
                System.out.println(number1);
                System.out.println(number2);
                System.out.println("\n\u001B[32mApós juntar as listas:\u001B[0m");
                ArrayList<Integer> juntalista = new ArrayList<>(number1.size()+number2.size());
                juntalista.addAll(number1);
                juntalista.addAll(number2);
                System.out.println(juntalista);
                System.out.println("\n---------------------------------");  
                break;

                case 7:
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mCalcule a média de um(a) aluno(a)\u001B[0m");
                /*7) Crie um programa que simule a fila de atendimento de um banco.*/
                System.out.println("\n---------------------------------");
                break;

                case 8:
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mCalcule a temperatura média do ano\u001B[0m");
                /*8) Crie um programa que receba a temperatura média de cada mês do ano e 
                após exiba a temperatura média do ano.*/
                System.out.println("\n---------------------------------");
                break;

                case 9:
                
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mCrie dois arrays de 10 posições\u001B[0m");
                /*9) Crie dois arrays de 10 posições e depois gere um terceiro array com os 
                valores intercalados desses dois arrays, ao final, imprima os 3.*/
                System.out.println("\nInsira os valores do 1º grupo");
                int[] grupo1 = new int[10];
                for(int i=0;i<10;i++){
                    System.out.println("Informe o "+(i+1)+"º valor:");
                    grupo1[i] = sc.nextInt();
                }
                System.out.println("-----------------");
                System.out.println("\nInsira os valores do 2º grupo");
                int[] grupo2 = new int[10];
                for(int i=0;i<10;i++){
                    System.out.println("Informe o "+(i+1)+"º valor:");
                    grupo2[i] = sc.nextInt();
                }
                //int[] grupo3 = new int[10];
                //grupo3 = ;
                System.out.println("\n---------------------------------");
                break;

                case 10:
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mLeia 20 valores e calcule a média\u001B[0m");
                /*10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores 
                e imprima os valores que são inferiores a esta média.*/
                int soma_valores = 0;               
                float[] valoresUsu = new float[20];
                for(int i=1;i<20;i++){
                    System.out.println("\nInforme o "+(i+1)+"ª valor: ");
                    valoresUsu[i] = sc.nextFloat();
                    soma_valores += valoresUsu[i];
                }
                //float mediaAri = soma_valores/20;
                //System.out.println("\nA média da soma dos valores: ", mediaAri)
                //if(valoresUsu[i]<mediaAri){
                    
                //}
                System.out.println("\n---------------------------------");
                break;
                
                case 11:
                int cont=0;
                System.out.println("\n---------------------------------");
                System.out.println("\n\t\u001B[32mInvestigação\u001B[0m\n");

                System.out.println("Você telefonou para a vítima na últimas 24h? - \u001B[32mS or N\u001B[0m\n");
                String resp1 = sc.next();
                if(resp1.equals("S")) {
                    cont++;
                }
                System.out.print("\nVocê esteve no local do crime? - \u001B[32mS or N\u001B[0m\n");
                String resp2 = sc.next();
                if(resp2.equals("S")){
                    cont++;
                }
                System.out.println("\nVocê mora perto do local do crime? - \u001B[32mS or N\u001B[0m\n");
                String resp3 = sc.next();
                if(resp3.equals("S")){
                    cont++;
                }
                System.out.println("\nVocê devia para a vítima? - \u001B[32mS or N\u001B[0m\n");
                String resp4 = sc.next();
                if(resp4.equals("S")){
                    cont++;
                }
                System.out.println("\nVocê já trabalhou com a vítima? - \u001B[32mS or N\u001B[0m\n");
                String resp5 = sc.next();
                if(resp5.equals("S")){
                    cont++;
                }
                System.out.println("\n\t O veredito é: ");
                if(0<cont && cont<1){
                    System.out.println("\n\u001B[36mVocê é inocente!!\u001B[0m");
                }if (cont<=2) {
                    System.out.println("\n\u001B[36mVocê está sendo considerado como um suspeito!!\u001B[0m");
                } if (cont<=3 && cont<=4) {
                    System.out.println("\n\u001B[36mVocê é cumplice do crime!!\u001B[0m");
                } else {
                    System.out.println("\n\u001B[36mVocê é o assassino da vítima!!\u001B[0m");
                }
                System.out.println("\n---------------------------------");
                break;

                default:
                System.out.println("Opção inválida!!");
                break;
            }
        } while(opcao != 0);
        sc.close();
}
}
