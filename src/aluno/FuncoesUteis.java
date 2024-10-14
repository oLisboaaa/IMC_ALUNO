package aluno;

public class FuncoesUteis {
    public String formatarCPF(String cpf) {
        // Garantindo que a String tenha 11 dígitos
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }

        // Formatando o CPF no padrão xxx.xxx.xxx-xx
        String cpfFormatado = cpf.substring(0, 3) + "." +
                cpf.substring(3, 6) + "." +
                cpf.substring(6, 9) + "-" +
                cpf.substring(9, 11);

        return cpfFormatado;
    }

    public double imc(double peso, double altura) {
        return peso / (altura * altura); //calculo de IMC = peso * altura^2
    }

    public double validNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            return nota;
        } else {
            throw new IllegalArgumentException("Nota inválida. Deve ser entre 0 e 10.");
        }
    }
}
