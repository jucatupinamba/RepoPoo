package ListaNomes;

import java.util.ArrayList;
import java.util.List;

public class Pesquisa {    //nova classe para lista
    int contador;
    Processo nome;

    List<Processo> lista = new ArrayList<>();

    public void cadastrarNome(String nome){
        lista.add( new Processo(nome));
    }

    public boolean pesquisarNome(String nome) {         //refazer lógica
        boolean pesquisa = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(nome)) {
                contador++;
                return true;
            } else {
                return false;
            }
        }
        return pesquisa;
    }
    public String toString(){
        return "O nome pesquisado foi encontrado " + contador + " vez(es).";
    }
}
