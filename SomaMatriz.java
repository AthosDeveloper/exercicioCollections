package exerciciosColections;

public class SomaMatriz {
    public static void main(String[] args) {
        int [][] matriz = new int[4][5];
        int soma = 0;
        matriz[0] = new int[]{1, 2, 3, 4, 5};
        matriz[1] = new  int[]{6, 7, 8, 9, 10};
        matriz[2] = new  int[]{11, 12, 13, 14, 15};
        matriz[3] = new int[]{16, 17, 18, 19, 20};
for (int i = 0; i < matriz.length; i++){
    for (int j = 0; j < matriz[i].length; j++){
        soma += matriz[i][j];
        System.out.println("a soma dos valores da matriz é: " + soma);
    }
}
    }
}
