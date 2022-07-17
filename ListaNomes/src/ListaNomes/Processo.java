package ListaNomes;

import java.util.List;

public class Processo {

    private String nome;
    private int contador;
    private boolean y = false;
    private String mensagem;

    public Processo(String nome){
        this.nome = nome;
    }

    public Processo() {

    }
    public String compara(List<Processo> lista, String nome){    // corrigir lógica
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).equals(nome)){
                contador++;
                System.out.println("Nome encontrado");
            }
        }
        return nome;
    }
    public String toString(){
        return  "O nome pesquisado foi encontrado " + contador + " vezes.";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
