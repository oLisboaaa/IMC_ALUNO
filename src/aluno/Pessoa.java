package aluno;

public class Pessoa {
    private String nome;
    private int cpf;
    private double peso;
    private double altura;
    
    public Pessoa(String nome, int cpf, double peso, double altura){
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura
    }
    public String getNome(){
        return nome;
    }
    
    public void setNome(){
        this.nome = nome
    }
    
    public int getCpf(){
        return cpf;
    }
    
    public void setCpf(){
        this.cpf = cpf
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(){
        this.peso = peso
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(){
        this.altura = altura
    }
}