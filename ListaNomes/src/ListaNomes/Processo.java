package ListaNomes;

public class Processo {

    private String nome;
    public Processo(String nome){
        this.nome = nome;
    }
    public String toString(){
        return " " + getNome();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
