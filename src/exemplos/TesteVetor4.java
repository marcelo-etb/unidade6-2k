package exemplos;
import util.Tela;
public class TesteVetor4 {
    public static void main(String[] args) {
        int quantidade = Tela.nextInt("Digite a quantidade de alunos");
        Aluno turma[] = new Aluno[quantidade];
        for (int i = 0; i < quantidade; i++) {
            Aluno a = new Aluno();
            a.setNome(Tela.nextString("Digite o nome do " + (i+1) + "� aluno"));
            a.setMedia(Tela.nextDouble("Digite a m�dia do " + (i+1) + "� aluno"));
            turma[i] = a;
        }
        String dados = "";
        for (int i = 0; i < quantidade; i++) {
            dados += turma[i] + "\n";
        }
        Tela.showMessage(dados);
    }

}
