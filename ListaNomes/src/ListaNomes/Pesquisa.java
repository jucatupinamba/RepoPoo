package ListaNomes;

import java.util.ArrayList;
import java.util.List;

public class Pesquisa {    //nova classe para lista
    int contador;
    String nome;

    List<String> lista = new ArrayList<>();

    public void cadastrarNome(String nome){
        lista.add(nome);
    }

    public int pesquisarNome(String nome) {         //refazer lógica
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(nome)) {
                contador++;
            }
        }
        return contador;
    }
    public String toString(){
        return "O nome pesquisado foi encontrado " + contador + " vez(es).";
    }
}
