package exemplos;

import util.Tela;
import java.text.DecimalFormat;

public class TesteTela {

    public static void main(String[] args) {
        String nome = Tela.nextString("Digite o nome");
        String endereco = Tela.nextString("Digite o endere�o");
        double salario = Tela.nextDouble("Digite o sal�rio");
        int anoNascimento = Tela.nextInt("Digite o ano de nascimento");
        int idade = 2024 - anoNascimento;
        double salarioLiquido = salario * 0.89;
        /*
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endere�o: " + endereco);
        System.out.println("Sal�rio Bruto: R$ " + salario);
        System.out.println("Sal�rio L�quido: R$ " + salarioLiquido); */
        DecimalFormat f = new DecimalFormat(",##0.00");
        String dados = "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Endere�o: " + endereco + "\n" +
                "Sal�rio Bruto: R$ " + f.format(salario) + "\n" +
                "Sal�rio L�quido: R$ " + f.format(salarioLiquido);
        Tela.showMessage(dados);
    }
}
