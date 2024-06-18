package exemplos;
import util.Tela;
public class TesteVetor4 {

    public static void main(String[] args) {
        int quantidade = Tela.nextInt("Digite a quantidade de alunos");
        Aluno turma[] = new Aluno[quantidade];
        for (int i = 0; i < quantidade; i++) {
            Aluno a = new Aluno();
            a.nome = Tela.nextString("Digite o nome do " + (i+1) + "º aluno");
            a.media = Tela.nextDouble("Digite a média do " + (i+1) + "º aluno");
            turma[i] = a;
        }
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println(turma[i]);
        }
    }

}
