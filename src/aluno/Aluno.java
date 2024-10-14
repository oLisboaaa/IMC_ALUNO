package aluno;

public class Aluno extends Pessoa {
    private double nota;
    private double presenca;

    public Aluno(String nome, String cpf, double peso, double altura, double nota, double presenca){
        super(nome, cpf, peso, altura);
        this.nota = nota;
        this.presenca = presenca;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public double getPresenca(){
        return presenca;
    }

    public void setPresenca(double presenca){
        this.presenca = presenca;
    }
}
