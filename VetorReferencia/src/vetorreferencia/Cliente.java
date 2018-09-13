/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorreferencia;

/**
 *
 * @author maromo
 */
public class Cliente {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String dadosCliente(){
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do Cliente \n");
        sb.append("Id do Cliente: ").append(id).append("\n");
        sb.append("Nome do Cliente: ").append(nome).append("\n\n");
        return sb.toString();
    }
    
}
