package projetotabuleiro;

import java.util.Random;

public class Tabuleiro {

    public int tabu[][];
    public int palpites[];

    public Tabuleiro() {
        //Definir o tabuleiro e vetor palpites
        tabu = new int[10][10];
        palpites = new int[2];
        //Gerar os valor aleatórios
        Random x = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabu[i][j] = x.nextInt(101);
            }
        }
    }

    public double verificarPalpites() {
        double premio = 0.0;
        int c1 = 0, c2 = 0;
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tabu[i][j] == palpites[p]) {
                        if (p == 0) {
                            c1++;
                        }
                        if (p == 1) {
                            c2++;
                        }
                    }
                }
            }
        }
        if ((c1 >= 3) || (c2 >= 3)) {
            premio = pagarPremio(c1 + c2);
        }
        return premio;
    }

    private double pagarPremio(int t) {
        return t * 1000;
    }

    public void apresentarTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%4d] ", tabu[i][j]);
            }
            System.out.println("");
        }

    }
}
