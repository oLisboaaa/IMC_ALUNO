package main;

import aluno.Aluno;
import aluno.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        // Instanciando um aluno
        Aluno aluno = new Aluno("João", "123456789101", 70.5, 1.75, 8.5, 90.0);

        // Criando um objeto de FuncoesUteis para cálculos
        FuncoesUteis funcoes = new FuncoesUteis();
        // Printando nome do aluno em qustão
        System.out.println("Aluno: "+aluno.getNome());
        // Calculando IMC
        double imc = funcoes.imc(aluno.getPeso(), aluno.getAltura());
        System.out.println("O IMC do aluno é: " + imc);

        // Validando nota
        double notaValida = funcoes.validNota(aluno.getNota());
        System.out.println("Nota válida: " + notaValida);

        // Formatando e exibindo o CPF
        try {
            String cpfFormatado = funcoes.formatarCPF(aluno.getCpf());
            System.out.println("CPF formatado: " + cpfFormatado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
