package aluno;

public class Aluno extends Pessoa {
    private double nota;
    private double precensa;
    
    public Pessoa(String nome, int cpf, double peso, double altura, double nota, double precensa){
        super(nome, cpf, peso, altura)
        this.nota = nota;
        this.precensa = precensa;
    }
    
    public double getNota(){
        return nota;
        
    }
    
    public void setNota(){
        if (nota > 0 || nota <10){
            nota = nota;
        }else{
            // add msg de erro
        }
    }

}