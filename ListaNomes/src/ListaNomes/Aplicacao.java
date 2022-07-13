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
        List<Processo> lista = new ArrayList<>();

        System.out.println("Digite abaixo nomes para compor a lista: ");
        System.out.println("Caso deseje encerrar a lista digite um número.");

            for(int i = 0; i <= lista.size(); i++) {        //Captação de dados, utilize um número para sair
                System.out.print("Nome: ");
                if(!scan.hasNextInt()) {                    //Se scan não for tipo int = true
                    lista.add(i, new Processo(scan.nextLine()));
                }
            }
        }
    }


