/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoesfera;

/**
 *
 * @author maromo
 */
public class Esfera {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcularVolume(){
        return 4/3.0 * Math.PI * Math.pow(raio, 3.0);
    }
}
