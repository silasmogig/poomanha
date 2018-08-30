package aula3008;

import java.util.Scanner;



public class Aula3008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rm;
        String nome;
        double valor;
        System.out.println("Digite o rm: ");
        //rm = input.nextInt();
        rm = Integer.parseInt(input.nextLine());
        System.out.println("Digite o nome: ");
        //nome = input.next();
        nome = input.nextLine();
        System.out.println("Digite a matricula: ");
        //valor = input.nextDouble();
        valor = Double.parseDouble(input.nextLine());
        System.out.println("RM " + rm);
        System.out.println("Nome: " + nome);
        System.out.println("Valor Mat. : " + valor);
        
    }
    
}
