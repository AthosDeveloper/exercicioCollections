package exerciciosColections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsereElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lojas = new ArrayList<>();
        lojas.add("iphone");
        lojas.add("notebook");


        System.out.println("Quantidade de posições: " + lojas.size());


        System.out.println("defina o nome do produto: ");
        String produto = sc.next();
        String compare = produto;
        if (produto.equals(compare)){
            lojas.add(produto);
        }

        System.out.println("quantidade de posições: " + lojas.size());
        System.out.println("posição inserida: Índice " + lojas.indexOf(produto));
    }




}
