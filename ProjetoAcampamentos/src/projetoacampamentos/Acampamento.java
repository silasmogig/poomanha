package projetoacampamentos;

public class Acampamento {

    public String nome;
    public char equipe;
    public int idade;

    public void imprimir() {
        System.out.println("Dados do Membro do Acampamento");
        System.out.println("Nome: " + nome);
        System.out.println("Equipe: " + equipe);
        System.out.println("Idade: " + idade);
        System.out.println("");
    }

    public void separarGrupo() {
        if (idade <= 5) {
            return;
        }
        if(idade<=10){
            equipe = 'A';
            return;
        }
        if(idade<=20){
            equipe = 'B';
            return;
        }
        equipe = 'C';
    }
}
