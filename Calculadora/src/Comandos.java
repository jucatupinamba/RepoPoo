public class Comandos implements OperacaoMatematica{
    private double numero1;
    private double numero2;
    protected double resultado;

    public Comandos(){}

    @Override
    public double soma(double numero1, double numero2) {
        resultado = numero1 + numero2;
        return resultado;
    }

    @Override
    public double subtracao(double numero1, double numero2) {
        resultado = numero1 - numero2;
        return resultado;
    }

    @Override
    public double multiplicacao(double numero1, double numero2) {
        resultado = numero1 * numero2;
        return resultado;
    }

    @Override
    public double divisao(double numero1, double numero2) {
        resultado = numero1 / numero2;
        return resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado(){
        return resultado;
    }
}
