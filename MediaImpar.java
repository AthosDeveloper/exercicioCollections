package exerciciosColections;

public class MediaImpar {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int valor = 0;
        int conta = 0;
for (int i = 0; i < numeros.length; i ++){
    if (numeros[i] % 2 != 0){
        System.out.println(numeros[i]);
valor += numeros[i];
   conta++;
    }

}
int media = valor / conta;
        System.out.println("a média dos valores é: " + media);

    }
}

