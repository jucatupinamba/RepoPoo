import java.util.Scanner;
public class CalculadoraApp {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Comandos operacao = new Comandos();

        System.out.println("Calculadora");
        System.out.println("Digite o primeiro número: ");
        operacao.setNumero1((sc.nextDouble()));
        sc.nextLine();

        System.out.println("Digite a operação: ");
        System.out.println("1 = Soma (+)\n" +
                "2 = Subtração (-)\n" +
                "3 = Multiplicação (*)\n" +
                "4 = Divisão (/)");
        int i = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        operacao.setNumero2(sc.nextDouble());

        double resultado;
        if(i == 1){
            resultado = operacao.soma(operacao.getNumero1(), operacao.getNumero2());
            System.out.println("O resultado da soma é : " + resultado);
        }
        if(i == 2){
            resultado = operacao.subtracao(operacao.getNumero1(), operacao.getNumero2());
            System.out.println("O resultado da subtração é : " + resultado);
        }
        if(i == 3){
            resultado = operacao.multiplicacao(operacao.getNumero1(), operacao.getNumero2());
            System.out.println("O resultado da multiplicação é : " + resultado);
        }
        if(i == 4){
            resultado = operacao.divisao(operacao.getNumero1(), operacao.getNumero2());
            System.out.println("O resultado da divisão é : " + resultado);
        }
        if(i <= 0 || i > 4){
            System.out.println("Número digitado inválido!");
        }

    }
}
