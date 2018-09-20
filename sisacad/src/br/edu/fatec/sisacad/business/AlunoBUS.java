package br.edu.fatec.sisacad.business;

import br.edu.fatec.sisacad.dal.AlunoDAO;
import br.edu.fatec.sisacad.model.Aluno;
import java.util.Random;


public class AlunoBUS {
    //Regras de Negocio com alunos
    public AlunoBUS(Aluno a){
        Random r = new Random();
        a.setRa(r.nextInt(1000000));
    }
    
    public boolean incluir(Aluno a){
        if(a.getNome().length()!=0){
            AlunoDAO dao = new AlunoDAO();
            boolean status = dao.incluirBanco(a);
            return status;
        }else{
            return false;
        }
    }
}
