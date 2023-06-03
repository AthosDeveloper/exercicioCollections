package exerciciosColections;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
   Double valor = 0.0;
   Double soma = 0.0;
   Integer quantidade = 0;
   List<Double> salarios = new ArrayList<>();
        System.out.println("digite a quantidade de funcionários: ");
        quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i ++){
            System.out.println("agora, informe o valor dos funcionários: ");
            valor = sc.nextDouble();
            salarios.add(valor);
for (Double salario: salarios){
    soma += salario;
}
        }

   Double mediaSalarial = soma/ salarios.size();
        System.out.println("a média salarial é de: " + d.format(mediaSalarial));
   sc.close();
    }
}
