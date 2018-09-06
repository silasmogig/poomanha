package projetocontascorrentes;

import java.util.Scanner;

public class PrincipalContasCorrente {

    public ContasCorrente cc = new ContasCorrente();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrincipalContasCorrente obj = new PrincipalContasCorrente();
        int opc = 0;
        while (opc != 9) {
            System.out.println("Menu...");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("9.. Sair");
            System.out.println("Escolha a opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    obj.execCadastrar();
                    break;
                case 2:
                    obj.execDeposito();
                    break;
                case 3:
                    obj.execSaque();
                    break;
                case 4:
                    obj.execConsulta();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a agencia: ");
        cc.agencia = sc.nextLine();
        System.out.println("Digite a conta: ");
        cc.conta = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Cadastrado com sucesso");
        
    }

    public void execConsulta() {
        cc.imprimir();
    }

    public void execSaque() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double vlr = Double.parseDouble(sc.nextLine());
        int r = cc.sacar(vlr);
        if(r==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo para o saque");
        }
    }

    public void execDeposito() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double vlr = Double.parseDouble(sc.nextLine());
        cc.depositar(vlr);
        System.out.println("Deposito efetuado com sucesso");
    }
}
