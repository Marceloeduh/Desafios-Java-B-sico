import java.util.Scanner;

public class somandoMultiplos {
    public static void main(String[] args) {
        int A, N;
        int soma = 0;

        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        N = entrada.nextInt();

        for(int i = 1; i <= N; i++){
            if(i % A == 0) {
                soma += i; 
            }
        }

        System.out.println(soma);
    }
    
}
    

