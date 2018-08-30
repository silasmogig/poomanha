package projetocomputadores;

public class PincipalComputador {

    public static void main(String[] args) {
        Computador c1 = new Computador();
        c1.marca = "hp";
        c1.cor = "Azul";
        c1.modelo = "Novo";
        c1.numeroSerie = 12321312;
        c1.preco = 2000.0;
        c1.imprimir();
        c1.calcularValor();
        System.out.println("");
        c1.imprimir();
        
        Computador c2 = new Computador();
        c2.marca = "ibm";
        c2.cor = "branco";
        c2.modelo = "veio";
        c2.numeroSerie = 231312;
        c2.preco = 5000.0;
        c2.imprimir();
        System.out.println("");
        c2.calcularValor();
        c2.imprimir();
        double novopreco = 6000.0;
        if(c2.alterarValor(novopreco)==1){
            System.out.println("Preco alterado");
        }else{
            System.out.println("Valor invalido");
        }
        c2.imprimir();
    }
    
}
