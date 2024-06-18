package exemplos;
import util.Tela;
public class TesteVetor3 {
    public static void main(String[] args) {
        int quantidade = Tela.nextInt("Digite a quantidade de alunos");
        String nomes[] = new String[quantidade];
        double medias[] = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            nomes[i] = Tela.nextString("Digite o nome do " + (i+1) + "º aluno");
            medias[i] = Tela.nextDouble("Digite a média do " + (i+1) + "º aluno");
        }        
        for (int i = 0; i < quantidade; i++) {
            String situacao;
            if (medias[i] >= 6) {
                situacao = "APROVADO!";
            } else {
                situacao = "!!! RECUPERAÇÃO !!!";
            }
            System.out.println(nomes[i] + " " + medias[i] + " - " + situacao);
        }
    }

}
