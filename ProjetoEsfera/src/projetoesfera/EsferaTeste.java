/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoesfera;

import java.util.Scanner;

/**
 *
 * @author maromo
 */
public class EsferaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Esfera esfera = new Esfera();
        System.out.println("Digite o valor do raio");
        esfera.setRaio(Double.parseDouble(sc.nextLine()));
        System.out.println("Volume: " + esfera.calcularVolume());
    }
    
}
