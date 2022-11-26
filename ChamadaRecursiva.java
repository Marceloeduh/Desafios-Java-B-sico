import java.util.*;

public class ChamadaRecursiva {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        
        int  N;

        N = numero.nextInt ();

        System.out.println( somatório ( N ));
    }

    
    static  int  somatório ( int  numero ) {
        if ( numero == 0 ) {
            return  0 ;
        } else {
            return  numero + somatório ( numero - 1 );
        }
    }
    
}
    

