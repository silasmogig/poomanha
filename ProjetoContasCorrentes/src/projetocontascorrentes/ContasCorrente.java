
package projetocontascorrentes;

public class ContasCorrente {
    String conta;
    String agencia;
    double saldo;
    String nomeCliente;
    
    public int sacar(double valor){
        if(valor<=saldo){
            saldo-= valor;
            return 1;
        }
        return 0;
    }
    public void depositar(double valor){
        saldo+= valor;
    }
    public void imprimir(){
        System.out.println("Dados da conta");
        System.out.println("Conta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------------------");
    }
    
}
