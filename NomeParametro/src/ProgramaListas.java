/*
Criar um programa passando um array com nomes e um nome como parâmetros.
O programa deve retornar a quantidade de vezes que o nome aparece na lista.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProgramaListas {
    public static void main (String [] args){

        Pesquisa pesquisa = new Pesquisa("Juca");
        Scanner scan = new Scanner(System.in);
        List<String> lista = new ArrayList<>(){{    //inicialização da lista com nomes pré estabelecidos
            add("Tyler");
            add("Musashi");
            add("Juca");
            add("Myamoto");
            add("Ace");
            add("Juca");
            add("Johnny");
            add("Durden");
        }};

        System.out.print("Digite o nome que deseja pesquisar: ");
        pesquisa.setNome(scan.nextLine());

        int contador = 0;                                   //variável para contabilizar nomes achados
        for(int i = 0; i < lista.size(); i++){              //lógica para passar a pesquisa por toda a lista
            if (lista.get(i).equals(pesquisa.getNome())){   //lógica de comparação dos dados da lista com nome digitado
                contador++;                                 //contador soma cada nome encontrado
            }
        }

        System.out.println("O nome pesquisado, " + pesquisa.getNome() + " foi encontrado " + contador + " vezes.");


    }
}
