package ListaNomes;

import java.util.ArrayList;
import java.util.List;

public class Pesquisa {
    String nome;
    String resposta = null;
    List<String> lista = new ArrayList<>();
    public void cadastrarNome(String nome){
        lista.add(nome);
    }
    public String pesquisarNome(String nome) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(nome)) {
                resposta = " foi encontrado.";
            }
            if(!lista.get(i).equals(nome)){
                resposta = " não foi encontrado.";
            }
        }
        return resposta;
    }
    public String toString(){
        return "O nome pesquisado" + resposta;
    }
}
