import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuAtividades2 {
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
                System.out.println("\n\u001B[32mCalcule a média do usuário\u001B[0m");
                
                System.out.println("Informe ao sistema a nota da 1ª prova - utilize as casas decimais");
                float prova01 = sc.nextFloat();
                System.out.println("Informe ao sistema a nota da 2ª prova - utilize as casas decimais");
                float prova02 = sc.nextFloat();
                System.out.println("Informe ao sistema a nota da 3ª prova - utilize as casas decimais");
                float prova03 = sc.nextFloat();

                float calculo = (prova01+prova02+prova03)/3;

                if(calculo>=7.0 && calculo<=10.0){
                    System.out.println("\nA sua média foi maior ou igual a sete. Parabéns, você foi aprovado!!!  "+calculo);
                }if (calculo>=4.9 && calculo<=6.9) {
                    System.out.println("\nA sua média foi maior ou igual a 4.9 || menor ou igual a 6.9 . Foque mais nos estudos, você ficou exame!!!  "+calculo);
                } if (calculo<=4.8) {
                    System.out.println("\nA sua média foi inferior a 4.9. Que pena, você foi reprovado!!!"+calculo);
                } 
                System.out.println("\n---------------------------------");
                break;

                case 2:
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mQual é o mês?\u001B[0m");
                System.out.println("Informe ao sistema um número que corresponde de 1 à 12");
                int ano = sc.nextInt();

                if(ano==1){
                    System.out.println("\nO mês informado é janeiro, use protetor solar ao sair na rua!!");
                } if (ano==2) {
                    System.out.println("\nO mês informado é fevereiro, prepare-se para o carnvall!!");
                } if (ano==3) {
                    System.out.println("\nO mês informado é março, esse é o mês do lollapalooza...aproveite!!");
                } if (ano==4) {
                    System.out.println("\nO mês informado é abril, não se esqueça de comprar os ovos da páscoa!!");
                } if (ano==5) {
                    System.out.println("\nO mês informado é maio, esse mês tem feriado ;) ");
                } if (ano==6) {
                    System.out.println("\nO mês informado é junho, prepare-se para as festas juninas ");
                } if (ano==7) {
                    System.out.println("\nO mês informado é julho, prepare-se para as festas julinas ");
                } if (ano==8){
                    System.out.println("\nO mês informado é agosto, feliz dia dos pais!");
                } if (ano==9){
                    System.out.println("\nO mês informado é setembro, esse é o mês da independência do Brasil");
                } if (ano==10){
                    System.out.println("\nO mês informado é outubro, esse é o mês das crianças e da oktoberfest");
                } if (ano==11){
                    System.out.println("\nO mês informado é novembro, esse é o mês tem feriado!!!");
                } if (ano==12){
                    System.out.println("\nO mês informado é dezembro, finalmente acabou o ano :)");
                } 
                System.out.println("\n---------------------------------");
                break;

                case 3:
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mJogo da forca em javaa\u001B[0m");

                System.out.println("\n Não consegui fazer essa questão...........");

                System.out.println("\n---------------------------------");
                break;

                case 4:
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mVerifique a tabuada\u001B[0m");
                System.out.println("Insira um número ");
                int tabu = sc.nextInt();
                for(int i=0;i<=10;i++){
                    calculo = (i*tabu);
                    System.out.println("\n"+i+" X "+tabu+" = "+calculo);
                }
                System.out.println("\n---------------------------------");
                break;

                case 5:
                
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mReceba um String\u001B[0m");
                System.out.println("Insira o algo");
                String texto = sc.next();

                for (char mostraTela : texto.toCharArray()){
                    System.out.println("\n"+mostraTela);
                }
                System.out.println("\n---------------------------------");  
                break;

                case 6:
                System.out.println("\n---------------------------------");
                int soma=0;

                System.out.println("\n\u001B[32mCalcule a soma de todos o números ímpares que são múltiplos de 7 que existem entre 1 à 500\\u001B[32m");

                for(int i=1;i<=500;i++){
                    if(i%7==0){
                        soma +=i;
                    }
                }

                System.out.println("\nA soma dos números ímpares que são múltiplos de 7 = "+soma);
                System.out.println("\n---------------------------------");  
                break;

                case 7:
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mCalcule a média de um(a) aluno(a)\u001B[0m");

                System.out.println("\nInforme ao sistema o valor da 1ª prova ");
                float prova1 = sc.nextFloat();
                if(prova1<0){
                    System.out.println("\u001B[31mValor digitado incorretamente ;)\u001B[0m");
                    System.exit(0);
                }

                System.out.println("\nInforme ao sistema o valor da 2ª prova ");
                float prova2 = sc.nextFloat();
                if(prova2<0){
                    System.out.println("\u001B[31mValor digitado incorretamente ;)\u001B[0m");
                    System.exit(0);
                }

                System.out.println("\nInforme ao sistema o valor da 3ª prova ");
                float prova3 = sc.nextFloat();
                if(prova3<0){
                    System.out.println("\u001B[31mValor digitado incorretamente ;)\u001B[0m");
                    System.exit(0);
                }

                System.out.println("\nInforme ao sistema o valor da 4ª prova ");
                float prova4 = sc.nextFloat();
                if(prova4<0){
                    System.out.println("\u001B[31mValor digitado incorretamente ;)\u001B[0m");
                    System.exit(0);
                }
                System.out.println("\nInforme ao sistema o valor da 5ª prova ");
                float prova5 = sc.nextFloat();
                if(prova5<0){
                    System.out.println("\u001B[31mValor digitado incorretamente ;)\u001B[0m");
                    System.exit(0);
                }
                System.out.println("\nInforme ao sistema o valor da 6ª prova ");
                float prova6 = sc.nextFloat();
                if(prova6<0){
                    System.out.println("\u001B[31mValor digitado incorretamente ;)\u001B[0m");
                    System.exit(0);

                }

                float media = (prova1+prova2+prova3+prova4+prova5+prova6)/6;

                System.out.println("\nA média das notas é "+media);
                System.out.println("\n---------------------------------");
                break;

                case 8:
                System.out.println("\n---------------------------------");
                double resultado = 0;
                float denominador = 3;

                System.out.println("\n\u001B[32mCalcule o fatorial do número\u001B[0m");

                System.out.println("Informe o número que será fatorado ");
                int fat = sc.nextInt();
                for(int i=2; i<=fat;i++){
                    resultado = resultado + (1/denominador);
                    denominador *=3;
                }

                System.out.println("O fatorial é "+resultado);
                System.out.println("\n---------------------------------");
                break;

                case 9:
                
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mCalcule o IMC de uma pessoa\u001B[0m");

                System.out.println("Informe a sua altura: ");
                float alturaUsu = sc.nextFloat();
                System.out.println("Informe o seu peso: ");
                float pesoUsu = sc.nextFloat();

                float calculoIMC = pesoUsu/(alturaUsu*2);
                if(calculoIMC<18.5){
                    System.out.println("\nVocê está abaixo do peso !");
                } if (18.6<=calculoIMC && calculoIMC<=24.9){
                    System.out.println("\nVocê está no peso ideal para o seu tipo de corpo!");
                } if (25.0<=calculoIMC && calculoIMC<=29.9){
                    System.out.println("\nVocê está levemente acima do seu peso ideal!");
                } if (30.0<=calculoIMC && calculoIMC<=34.9){
                    System.out.println("\nVocê está com Obesidade Grau I !!");
                } if (35.0<=calculoIMC && calculoIMC<=39.9){
                    System.out.println("\nVocê está com Obesidade Grau II !!");
                } if (calculoIMC>=40.0){
                    System.out.println("\nVocê está com Obesidade Grau III !!");
                }
                System.out.println("\n---------------------------------");
                break;

                case 10:
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mCrie a sua operação matematica\u001B[0m");
                System.out.println("\nInforme o 1º valor ");
                int valor01 = sc.nextInt();
                System.out.println("\nInforme o 2º valor ");
                int valor02 = sc.nextInt();
                System.out.println("\nInforme qual será a operação \u001B[35m( + | - | / | * | ** )\u001B[32m");
                String operacao = sc.next();

                if (operacao=="+"){
                    int operacao1 = (valor01+valor02);
                    System.out.println(valor01+" + "+valor02+" = "+operacao1);
                } if (operacao=="-"){
                    int operacao2 = (valor01-valor02);
                    System.out.println(valor01+" - "+valor02+" = "+operacao2);
                } if (operacao=="/"){
                    float operacao3 = (valor01/valor02);
                    System.out.println(valor01+" / "+valor02+" = "+operacao3);
                } if (operacao=="*"){
                    int operacao4 = (valor01*valor02);
                    System.out.println(valor01+" * "+valor02+" = "+operacao4);
                } if (operacao=="**"){
                    int operacao5 = (valor01-valor02);
                    System.out.println(valor01+" ** "+valor02+" = "+operacao5);
                }
                System.out.println("\n---------------------------------");
                break;
                
                case 11:
                System.out.println("\n---------------------------------");
                System.out.println("\n\u001B[32mVerifique a quantidade de notas que serão entregues\u001B[0m");
                System.out.println("\nInforme o valor ");
                int notas = sc.nextInt();
                
                int notasCem = (notas / 100);
                notas %= 100;
                int notasCinquenta = (notas / 50);
                notas %= 50;
                int notasVinte = (notas / 20);
                notas %= 20;
                int notasDez = (notas / 10);
                notas %= 10;
                int notasCinco = (notas / 5);
                notas %= 5;
                int notasDois = (notas / 2);
                notas %= 2;
                int moedaUm = notas;
                System.out.println("\nVai precisar de \u001B[34m"+ notasCem+"\u001B[0m notas de R$100,00; " );
                System.out.println("\nVai precisar de \u001B[34m"+ notasCinquenta+"\u001B[0m notas de R$50,00; " );
                System.out.println("\nVai precisar de \u001B[34m"+ notasVinte+"\uu001B[0m notas de R$20,00; " );
                System.out.println("\nVai precisar de \u001B[34m"+ notasDez+"\u001B[0m notas de R$10,00; " );
                System.out.println("\nVai precisar de \u001B[34m"+ notasCinco+"\u001B[0m notas de R$05,00; " );
                System.out.println("\nVai precisar de \u001B[34m"+ notasDois+"\u001B[0m notas de R$02,00 " );
                System.out.println("\nVai precisar de \u001B[34m"+ moedaUm+"\u001B[0m moedas de R$01,00; " );
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
