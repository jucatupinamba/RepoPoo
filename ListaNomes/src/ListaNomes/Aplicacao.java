package ListaNomes;
/*
Criar um programa onde, ao informar um nome, ele deve pesquisar em uma lista já existente o nome informado.
Ele deve retornar uma msg dizendo se foi encontrado ou não o nome nessa lista.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        Pesquisa pesquisa = new Pesquisa();

        System.out.println("Digite abaixo nomes para compor a lista: ");
        System.out.println("Digite 0 caso deseje fechar a lista. ");


        for(int i = 0; i <= pesquisa.lista.size(); i++) {
            System.out.print("Nome: ");
            if(!scan.hasNextInt()){
                pesquisa.cadastrarNome(scan.nextLine());
            }
        }
        System.out.print("Digite o nome que deseja pesquisar: ");
        scan.nextLine();
        pesquisa.pesquisarNome(scan.nextLine());

        System.out.println(pesquisa.toString());
        }
    }


