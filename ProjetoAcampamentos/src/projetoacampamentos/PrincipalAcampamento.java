/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoacampamentos;

import java.util.Scanner;

public class PrincipalAcampamento {


    public static void main(String[] args) {
        // TODO code application logic here
        Acampamento membro = new Acampamento();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do escoteiro: ");
        membro.nome = sc.nextLine();
        System.out.println("Digite a idade do(a) " + membro.nome);
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();
    }
    
}
