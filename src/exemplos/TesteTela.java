package exemplos;

import util.Tela;
import java.text.DecimalFormat;

public class TesteTela {

    public static void main(String[] args) {
        String nome = Tela.nextString("Digite o nome");
        String endereco = Tela.nextString("Digite o endereço");
        double salario = Tela.nextDouble("Digite o salário");
        int anoNascimento = Tela.nextInt("Digite o ano de nascimento");
        int idade = 2024 - anoNascimento;
        double salarioLiquido = salario * 0.89;
        /*
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("Salário Líquido: R$ " + salarioLiquido); */
        DecimalFormat f = new DecimalFormat(",##0.00");
        String dados = "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Endereço: " + endereco + "\n" +
                "Salário Bruto: R$ " + f.format(salario) + "\n" +
                "Salário Líquido: R$ " + f.format(salarioLiquido);
        Tela.showMessage(dados);
    }
}
