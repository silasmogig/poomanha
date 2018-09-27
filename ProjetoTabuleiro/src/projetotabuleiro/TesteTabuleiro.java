
package projetotabuleiro;

import java.util.Scanner;


public class TesteTabuleiro {


    public static void main(String[] args) {
        Tabuleiro t = new Tabuleiro();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite o palpite %d \n", (i+1));
            t.palpites[i] = Integer.parseInt(sc.nextLine());
        }
        double premio = t.verificarPalpites();
        if(premio>0.0){
            System.out.println("Seu premio eh: " + premio);
        }else{
            System.out.println("Não foi desta vez");
        }
        t.apresentarTabuleiro();
    }
    
}
