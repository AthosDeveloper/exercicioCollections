package exerciciosColections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElemento {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> frutas = new ArrayList<>();
        frutas.add("banana");
        frutas.add("manga");
        frutas.add("maçã");

        System.out.println("Quantidade de posições: " + frutas.size());

        System.out.println("informe o número da posição que você deseja remover: ");
        int remocao = sc.nextInt();
        int compare = remocao;
        if (remocao == compare) {
            frutas.remove(remocao);
        }
        System.out.println("a lista agora tem " + frutas.size() + " posições.");

        sc.close();
    }
}


