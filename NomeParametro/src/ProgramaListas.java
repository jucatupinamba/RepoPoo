//Aplicaçao de pesquisa de nomes, utilizando um array e um nome como parametro.

public class ProgramaListas {
    public static void pesquisa(String nome, String [] arr){        // Metodo com nome e array como parametros.
        int cont = 0;

        for(String x : arr){
            if (x == nome){
                cont++;
            }
        }
        System.out.println("O nome pesquisado foi encontrado " + cont + " vezes nessa lista.");
    }

    public static void main (String [] args){

        String [] arr = {"Caio", "Manoel", "Daniela", "Marcos", "Caio", "Daniel", "Maicon", "Caio"};
        pesquisa("Caio", arr);

    }
}
