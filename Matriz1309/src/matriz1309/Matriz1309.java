package matriz1309;

import java.util.Random;

public class Matriz1309 {

    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int matriz[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = r.nextInt(10);
                System.out.printf("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
