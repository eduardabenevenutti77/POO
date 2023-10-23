import java.util.Scanner;

public class Investi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
                if(0<cont && cont==1){
                    System.out.println("\n\u001B[36mVocê é inocente!!\u001B[0m");
                }if (cont>=2) {
                    System.out.println("\n\u001B[36mVocê está sendo considerado como um suspeito!!\u001B[0m");
                } if (cont<=3 && cont<=4) {
                    System.out.println("\n\u001B[36mVocê é cumplice do crime!!\u001B[0m");
                } else {
                    System.out.println("\n\u001B[36mVocê é o assassino da vítima!!\u001B[0m");
                }
                System.out.println("\n---------------------------------");
    }
}
