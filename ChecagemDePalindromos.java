import java.util.Scanner;

public class ChecagemDePalindromos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine();

        String novaPalavra = "";
        String[] letras = palavra.split("");
        for (int i = letras.length-1; i >= 0; i--){
            novaPalavra = novaPalavra + letras[i];
        }

        System.out.println(novaPalavra.equals(palavra)?"TRUE":"FALSE");
    }
}