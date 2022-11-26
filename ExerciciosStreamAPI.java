import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import javax.sound.midi.Soundbank;

public  class  ExerciciosStreamAPI {

    public static void main(String[] args) {
     
        List<String> numerosAleatorios =
                Arrays.asList ( "1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

                System.out.println("Imprima todos os elementos dessa lista de String: ");
                numerosAleatorios.forEach(System.out::println);    

                System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");

                numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println); 

               System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");

               List<Integer> collectList = numerosAleatorios.stream()
               .map(Integer::parseInt)
               .collect(Collectors.toList());
               

                System.out.println(numerosAleatorios);

                List<Integer> numerAleatoriosInteger = numerosAleatorios.stream()
               .map(Integer::parseInt)
               .collect(Collectors.toList());

                System.out.println("Coloque em uma lista os números pares e maiores do que 2: ");
               List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)  .collect(Collectors.toList());
                System.out.println(ListParesMaioresQue2);

                System.out.println("Mostre a média dos números: ");

                numerosAleatorios.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
                .ifPresent(v -> System.out.println(v));

                System.out.println("Remova os valores impares: ");
                numerAleatoriosInteger.removeIf(integer -> integer % 2 !=0); 
                 
                   System.out.println(numerAleatoriosInteger);
               
            
                
                
               
        
                
                

    }
}