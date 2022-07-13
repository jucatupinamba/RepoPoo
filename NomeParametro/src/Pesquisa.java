import java.util.List;

public class Pesquisa {
    private String nome;


    public Pesquisa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString() {
        return "Nome: " + getNome();
    }
}
