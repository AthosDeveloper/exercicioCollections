package exerciciosColections;

import java.util.*;

public class NumeroReverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
     Integer entrada = 0;
        List<Integer> numeros = new ArrayList<>();
 while (contador < 2){
     System.out.println("defina o número ");
     entrada = sc.nextInt();
     numeros.add(entrada);



     contador ++;
 }
        Collections.sort(numeros, Collections.reverseOrder());


        for (Integer numero: numeros){

    System.out.println(numeros);
}


    }
}


