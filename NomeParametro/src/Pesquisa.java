import java.util.ArrayList;
import java.util.List;

public class Pesquisa {
    private String nome;
    private int contador;
    List<String> lista = new ArrayList<>();

    public Pesquisa(){}
    public void cadastrarNome(String nome){
        lista.add(nome);
    }
    public void pesquisarNome(String nome){      //debugar método
        contador = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).equals(nome)){
                contador++;
            }
        }
    }
    public String toString(){
        return "O nome pesquisado foi encontrado " + contador + " vezes;";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
