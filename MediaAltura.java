package exerciciosColections;

import java.text.DecimalFormat;
import java.util.*;

public class MediaAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        Double altura;

        String genero;
Double somaAlturaHomens = 0.0;
Double somaAlturaMulheres = 0.0;
Integer numMulheres = 0;
Integer numHomens = 0;
Double max = 0.0;
Double min = 10.5;
        HashMap <String, Double> pessoas = new HashMap();


        for (int i = 0; i < 10; i++){
            System.out.println("informe o gênero: M para masculino e F para feminino.");
      genero = sc.next().toUpperCase();



    System.out.println("informe sua altura: ");
            altura = sc.nextDouble();
pessoas.put(genero, altura);
if (genero.equalsIgnoreCase("m")){
somaAlturaHomens += altura;
numHomens++;
        } else if (genero.equalsIgnoreCase("f")){
    somaAlturaMulheres += altura;
    numMulheres++;
        }
if (max < altura){
    max = altura;
} else if (min > altura){
    min = altura;
}


}
        Double mediaHomens = numHomens > 0 ? somaAlturaHomens / numHomens : 0.0;
        Double mediaMulheres = numMulheres > 0? somaAlturaMulheres / numMulheres: 0.0;
        System.out.println("a média de homens é: " + d.format(mediaHomens));
        System.out.println("a média de mulheres é: " + d.format(mediaMulheres));
        System.out.println("a quantidade de mulheres é de: " + numMulheres);
        System.out.println("a quantidade de homens é de: " + numHomens);

        System.out.println("A menor altura é de: " + d.format(min));
        System.out.println("o mais alto é de: " + d.format(max));

    }



}

