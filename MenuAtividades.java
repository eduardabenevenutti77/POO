import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuAtividades {
    public static void main(String[] args) {
        System.out.println("Atividades de Java!!");
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("Lista 01 - Atividade 1");
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

                case 6:
                int soma=0;
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule a soma de todos o números ímpares que são múltiplos de 7 que existem entre 1 à 500");
                for(int i=1;i<=500;i++){
                    if(i%7==0){
                        soma +=i;
                    }
                }
                System.out.println("A soma dos números ímpares que são múltiplos de 7 = "+soma);
                System.out.println("\n---------------------------------");  

                case 7:
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule a média de um(a) aluno(a)");

                System.out.println("Informe ao sistema o valor da 1ª prova ");
                int prova1 = sc.nextInt();
                if(prova1<0){
                    System.out.println("Valor digitado incorretamente ;)");
                    System.exit(0);
                }
                System.out.println("Informe ao sistema o valor da 2ª prova ");
                int prova2 = sc.nextInt();
                if(prova2<0){
                    System.out.println("Valor digitado incorretamente ;)");
                    System.exit(0);
                }
                System.out.println("Informe ao sistema o valor da 3ª prova ");
                int prova3 = sc.nextInt();
                if(prova3<0){
                    System.out.println("Valor digitado incorretamente ;)");
                    System.exit(0);
                }
                System.out.println("Informe ao sistema o valor da 4ª prova ");
                int prova4 = sc.nextInt();
                if(prova4<0){
                    System.out.println("Valor digitado incorretamente ;)");
                    System.exit(0);
                }
                System.out.println("Informe ao sistema o valor da 5ª prova ");
                int prova5 = sc.nextInt();
                if(prova5<0){
                    System.out.println("Valor digitado incorretamente ;)");
                    System.exit(0);
                }
                System.out.println("Informe ao sistema o valor da 6ª prova ");
                int prova6 = sc.nextInt();
                if(prova6<0){
                    System.out.println("Valor digitado incorretamente ;)");
                    System.exit(0);
                }
                media = (prova1+prova2+prova3+prova4+prova5+prova6)/6;
                System.out.println("A média das notas é "+media);
                System.out.println("\n---------------------------------");

                case 8:
                double resultado = 0;
                float denominador = 3;
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule o fatorial do número");

                System.out.println("Informe o número que será fatorado ");
                int fat = sc.nextInt();
                for(int i=2; i==fat;i++){
                    resultado = resultado + (1/denominador);
                    denominador *=3;
                }
                System.out.println("O fatorial é "+resultado);
                System.out.println("\n---------------------------------");
                default:
                System.out.println("Opção inválida!!");
                break;
            }
        } while(opcao != 0);
        sc.close();
    }
}
