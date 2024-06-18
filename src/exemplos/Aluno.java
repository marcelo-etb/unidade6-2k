package exemplos;
public class Aluno {
    String nome;
    double media; 
    public String getSituacao() {
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Recuperação";
        }
    }
    @Override
    public String toString() {
        return nome + " " + media + " - " + getSituacao();
    }
    
    
}
