package vetorreferencia;

import java.util.Scanner;

public class VetorReferencia {

    Cliente vet[] = new Cliente[10];
    int posicao = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        VetorReferencia vr = new VetorReferencia();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Apresentar Todos");
            System.out.println("3.. Procurar");
            System.out.println("9.. Sair");
            System.out.println("Escolha opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    Cliente c = new Cliente();
                    System.out.println("Digite o id do Cliente: ");
                    c.setId(Integer.parseInt(sc.nextLine()));
                    System.out.println("Digite o nome do Cliente: ");
                    c.setNome(sc.nextLine());
                    vr.inserirCliente(c);
                    break;
                case 2:
                    vr.imprimirTodos();
                    break;
                case 3:
                    Cliente cp = new Cliente();
                    System.out.println("Digite o id do Cliente Procurado: ");
                    cp.setId(Integer.parseInt(sc.nextLine()));
                    vr.encontrarCliente(cp);
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opc != 9);

    }

    public String inserirCliente(Cliente c) {
        vet[posicao++] = c;
        return "Cliente cadastrado com sucesso\n";
    }

    public void imprimirTodos() {
        //Percorrer o vetor e imprimir os dados
        for (Cliente cliente : vet) {
            if (cliente != null) {
                System.out.println(cliente.dadosCliente());
            }
        }
    }

    public void encontrarCliente(Cliente c) {
        for (Cliente cliente : vet) {
            if (cliente != null) {
                if(cliente.getId()==c.getId()){
                    System.out.println(cliente.dadosCliente());
                }
            }
        }
    }

}
