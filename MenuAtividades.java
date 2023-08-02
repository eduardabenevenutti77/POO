import java.util.InputMismatchException;
import java.util.Scanner;



public class MenuAtividades {
    public static void main(String[] args) {
        System.out.println("Atividades de Java!!");
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("\n\t Lista 01 \n");
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
            System.out.println("[11] - Atividade 11");
            System.out.println("[12] - Desafio");
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
                System.out.println("\nCalcule a média");
                System.out.println("Digite a 1ª nota: ");
                int nota1 = sc.nextInt();
                System.out.println("Digite a 2ª nota: ");
                int nota2 = sc.nextInt();
                System.out.println("Digite a 3ª nota: ");
                int nota3 = sc.nextInt();

                int media = (nota1+nota2+nota3)/3;
                System.out.println("A média é: "+media);
                System.out.println("\n---------------------------------");
                break;

                case 2:
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule a área");
                System.out.println("Informe o valor do 1º lado: ");
                int lado1 = sc.nextInt();
                System.out.println("Informe o valor do 2º lado: ");
                int lado2 = sc.nextInt();

                int area = (lado1*lado2);
                System.out.println("O calculo da área é: "+area);
                System.out.println("\n---------------------------------");
                break;

                case 3:
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule o valoume");
                System.out.println("Informe a largura: ");
                int largura = sc.nextInt();
                System.out.println("Informe a altura: ");
                int altura = sc.nextInt();
                System.out.println("Informe a profundidade: ");
                int profundidade = sc.nextInt();

                int valoume = (largura*altura*profundidade);
                System.out.println("O calculo do volume é: "+valoume);
                System.out.println("\n---------------------------------");
                break;

                case 4:
                System.out.println("\n---------------------------------");
                System.out.println("\nVerifique os valores");
                System.out.println("Informe o 1º valor de comparação: ");
                int valor1 = sc.nextInt();
                System.out.println("Informe o 2º valor de comparação: ");
                int valor2 = sc.nextInt();

                if(valor1>(valor2*2))
                System.out.println("O valor de comparação é maior que o dobro do outro valor  ");
                else
                System.out.println("O valor de comparação não é maior que o dobro do outro valor  ");
                System.out.println("\n---------------------------------");
                break;

                case 5:
                double x1,x2;
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule baskhara");
                System.out.println("Informe o valor de A: ");
                int valorA = sc.nextInt();
                System.out.println("Informe o valor de B: ");
                int valorB = sc.nextInt();
                System.out.println("Informe o valor de C: ");
                int valorC = sc.nextInt();

                int delta = (valorB*2)+(4*(valorA*valorC));
                System.out.println("O valor de delta = "+delta);
                
                if(delta>=0){
                    x1 = ((-(valorB)+Math.sqrt(delta))/2*valorA);
                    x2 = ((-(valorB)-Math.sqrt(delta))/2*valorA);

                    System.out.println("x1 = "+x1);
                    System.out.println("x2 = "+x2);
                
                }else{
                    System.out.println("O valor de delta não possui raiz!");
                }
                System.out.println("\n---------------------------------");  
                break;

                case 6:
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule a velocidade média de uma viagem de carro");
                
                System.out.println("Informe a distância (km)");
                int kilometro = sc.nextInt();
                System.out.println("Informe o tempo (h)");
                int hora = sc.nextInt();

                int teste = (kilometro/hora);
                
                System.out.println("A velocidade média da viagem foi de: "+teste);
                System.out.println("\n---------------------------------");  
                break;

                case 7:
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule o percentual de imposto pago por uma empresa");

                System.out.println("Informe ao sistema o faturamento da empresa  ");
                int faturamento = sc.nextInt();
                if(faturamento<0){
                    System.out.println("Valor digitado incorretamente ;)");
                    System.exit(0);
                }
                System.out.println("Informe ao sistema a quantidade de impostos pagos pela empresa ");
                int imposto = sc.nextInt();
                if(imposto<0){
                    System.out.println("Valor digitado incorretamente ;)");
                    System.exit(0);
                }
                
                float calculoPagamento = (faturamento/imposto);

                System.out.println("A quantidade de impostos pagos pela empresa foi de R$ "+calculoPagamento);
                System.out.println("\n---------------------------------");
                break;

                case 8:

                System.out.println("\n---------------------------------");
                System.out.println("\n\tVerifique se o número é par ou ímpar");

                System.out.println("\nInforme o número: ");
                int nm = sc.nextInt();
                if(nm%2==0){
                    System.out.println("\nO número informado é par");
                }else{
                    System.out.println("\nO número informado é ímpar");
                }
                System.out.println("\n---------------------------------");
                break;

                case 9:
                
                System.out.println("\n---------------------------------");
                System.out.println("\n\tCompare duas frases (strings)");

                System.out.println("Informe a 1ª: ");
                String resp1 = sc.next();
                System.out.println("Informe a 2ª: ");
                String resp2 = sc.next();

                if(resp1.equals(resp2)){
                    System.out.println("Ambas as frases são iguais!");
                }else{
                    System.out.println("As frases são diferentes!");
                }
                System.out.println("\n---------------------------------");
                break;

                case 10:

                System.out.println("\n---------------------------------");
                System.out.println("\n\tTransforme string em int");
                System.out.println("Digite algo ou letra: ");
                //Scanner s = new Scanner(System.in);
                //String trasnf = s.nextLine();

                /*try{
                    int i = Integer.parseInt(trasnf);
                    
                } catch (NumberFormatException e) {
                    System.out.println("Formatação errada");
                }*/
                break;
                
                case 11:
                System.out.println("\n---------------------------------");
                System.out.println("\n\tVerifique o seu salário");
                System.out.println("Informe o seu sálario: ");
                float salario = sc.nextFloat();

                if(salario<=1903.98){
                System.out.println("\nVocê está insento!!"); 
                } if (1903.99<=salario && salario<=2826.65) {
                    System.out.println("\nVocê deve pagar 7,5%!!");
                } if (salario>=2826.66 && salario<=3751.05) {
                    System.out.println("\nVocê deve pagar 15%!!");
                } if (salario>=3751.06 && salario<=4664.68) {
                    System.out.println("\nVocê deve pagar 22,5%!!");
                } else {
                    System.out.println("\nVocê deve pagar 27,5%!!");
                } 
                break;

                case 12:
                System.out.println("\n---------------------------------");
                System.out.println("\n\tVerifique se  número é primo\n");
                System.out.println("Informe o número a ser verificado ");
                int nmPrimo = sc.nextInt();
                if(nmPrimo%1==0){
                    if(nmPrimo%nmPrimo==0){
                    System.out.println("Parabéns o número informado é primo ;)");
                }else{
                    System.out.println("Que pena, o número informado não é primo ;(");
                }
                }
                break;
                default:
                System.out.println("Opção inválida!!");
                break;
            }
        } while(opcao != 0);
        sc.close();
    }
}
