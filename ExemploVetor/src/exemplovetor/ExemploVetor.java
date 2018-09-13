package exemplovetor;


public class ExemploVetor {

    
    public static void main(String[] args) {
        int v[] = new int[5];
        for (int boladavez : v) {
            System.out.println(boladavez);
        }
        float x[] = new float[5];
        for (float item : x) {
            System.out.println(item);
        }
        int vcargado[] = {2, 4, 6, 8, 10, 12, 14, 16};
        for (int valor : vcargado) {
            System.out.println(valor);
        }
    }
    
}
