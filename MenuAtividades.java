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
                System.out.println("\n---------------------------------");
                System.out.println("\nCalcule baskhara");
                System.out.println("Informe o valor de A: ");
                int valorA = sc.nextInt();
                System.out.println("Informe o valor de B: ");
                int valorB = sc.nextInt();
                System.out.println("Informe o valor de C: ");
                int valorC = sc.nextInt();

                int delta = (valorB*2)-4*valorA*valorC;
                int RaizDelta

            default:
                System.out.println("Opção inválida!!");
                break;
            }
        } while(opcao != 0);
        sc.close();
    }
}
