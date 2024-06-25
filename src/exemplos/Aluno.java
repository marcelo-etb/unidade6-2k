package exemplos;
public class Aluno {
    private String nome;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
     
    public String getSituacao() {
        if (getMedia() >= 6) {
            return "Aprovado";
        } else {
            return "Recuperação";
        }
    }
    
    @Override
    public String toString() {
        return getNome() + " " + getMedia() + " - " + getSituacao();
    }
    
}
