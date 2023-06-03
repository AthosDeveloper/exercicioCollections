package exerciciosColections;

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um número: ");
        Integer numero = sc.nextInt();
        Integer reverte = Integer.reverse(numero);

        String numeroRevertido = Integer.toString(reverte);
        String reverce = numeroRevertido.substring(0, 3);

        System.out.println("o número revertido é: " + reverce);



    }
}


