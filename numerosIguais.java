import java.util.Scanner;

        public class numerosIguais {
        
          public static void main(String[] args) {
        
          Scanner entrada = new Scanner(System.in);

          int numero1;
          int numero2;
          
          
          numero1 = entrada.nextInt();

          numero2 = entrada.nextInt();
          
          if (numero1 == numero2) {
          System.out.println("Sao iguais!");
          } else System.out.print("Nao sao iguais!");
        }
    }