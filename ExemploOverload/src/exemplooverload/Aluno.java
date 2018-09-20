package exemplooverload;

import java.util.Random;


public class Aluno {
    private int ra;
    private String nome;

    //Método Constrututor padrao
    public Aluno(){
        Random r = new Random();
        this.ra = r.nextInt(100000);
    }
    
    public Aluno(String nome){
        this();
        this.nome = nome;
    }
    
    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    
    
}
