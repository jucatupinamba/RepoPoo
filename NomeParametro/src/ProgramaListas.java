/*
Criar um programa passando um array com nomes e um nome como parâmetros.
O programa deve retornar a quantidade de vezes que o nome aparece na lista.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProgramaListas {
    public static void main (String [] nome){

        Pesquisa pesquisa = new Pesquisa();
        Scanner scan = new Scanner(System.in);   // pesquisar encerramento da lista pelo scan

        System.out.println("Digite os nomes para compor a lista.");
        System.out.println("Digite 0 caso deseje encerrar.");
        for(int i = 0; i <= pesquisa.lista.size(); i++) {
            System.out.print("Nome: ");
            if(!scan.hasNextInt()){
                pesquisa.cadastrarNome(scan.nextLine());
            }
        }
        System.out.println("A lista de nomes foi criada");
        scan.nextLine();
        System.out.print("Digite o nome que deseja pesquisar.");
        pesquisa.pesquisarNome(scan.nextLine());

        System.out.println(pesquisa.toString());
    }
}
