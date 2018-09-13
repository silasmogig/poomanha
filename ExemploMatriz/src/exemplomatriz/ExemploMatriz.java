package exemplomatriz;

import java.util.Random;


public class ExemploMatriz {


    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        Random r = new Random();
        //Preencher
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int g;
                while(true){
                    g = r.nextInt(8);
                    if (g>2) break;
                }
                matriz[i][j] = g;
            }
        }
        //Varrer e mostrar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%2d]", matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
