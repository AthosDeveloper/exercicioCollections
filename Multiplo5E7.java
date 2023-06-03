package exerciciosColections;

import java.util.Scanner;

public class Multiplo5E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um número inteiro, e direi se ele é múltiplo de 5 e 7: ");
        int numero = sc.nextInt();
if (numero % 2 == 0){
            System.out.println("o número " + numero + " não é múltiplo de 5 e 7.");
        } else {
System.out.println("ele é múltiplo de 5 e 7.");
        }

    }
}
