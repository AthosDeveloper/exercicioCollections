package exerciciosColections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IdadeMaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade = 0;
        Integer max = 0;
        Integer min = 200;
        List<Integer> idades = new ArrayList<>();
        for (int i = 0; i < 9; i ++){
            System.out.println("informe a idade correspondente: ");
            idade = sc.nextInt();
            idades.add(idade );
            if (min < idade){
                min = idade;
            }else if(max > idade){
                max = idade;
            }
        }
        System.out.println("o mais novo tem " +min + " e a pessoa mais velha tem: " + max);

}
}
