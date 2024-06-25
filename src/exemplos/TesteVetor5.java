package exemplos;
import util.Tela;
import java.util.ArrayList;
public class TesteVetor5 {
    public static void main(String[] args) {
         String menu = "Escolha uma das opções abaixo:\n"
                 + "1 - Cadastrar Aluno\n"
                 + "2 - Listar Alunos\n"
                 + "3 - Sair";
         int opcao;
         ArrayList<Aluno> turma = new ArrayList();
         do {
            opcao = Tela.nextInt(menu);
            switch (opcao) {
                case 1: // Cadastrar
                    Aluno a = new Aluno();
                    a.setNome(Tela.nextString("Digite o nome"));
                    a.setMedia(Tela.nextDouble("Digite a média"));
                    turma.add(a);
                    Tela.showMessage("Aluno cadastrado com sucesso!");
                    break;
                case 2: // Listar
                    if (turma.isEmpty()) {
                        Tela.showMessage("Nenhum aluno nesta turma");
                    } else {
                        String lista = "";
                        for (Aluno aluno : turma) {
                            lista += aluno + "\n";
                        }
                        Tela.showMessage(lista);
                    }
                    break;
                case 3: // Sair
                    break;
                default:
                    Tela.showMessage("Opção inválida");
            }
         } while (opcao != 3);
        
    }

}
