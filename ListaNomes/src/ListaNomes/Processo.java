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
    public boolean equals(List<Processo> lista, String nome){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).equals(nome)){
                y = true;
                contador++;
            }
            else{
                y = false;
            }
        }
        return y;
    }
    public String toString(){
        if(y){
            mensagem = "O nome pesquisado foi encontrado " + contador + " vezes.";
        }
        else{
            mensagem = "O nome pesquisado não foi encontrado.";
        }
        return mensagem;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
