import java.util.List;

public class Pesquisa {

    private String nome;
    private int contador;

    public Pesquisa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String toString() {
        return "Nome: " + getNome();
    }
}
