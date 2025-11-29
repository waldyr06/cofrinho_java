package banco;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return String.format("Dolar - Valor: R$ %.2f", this.valor);
    }

    @Override
    public double converter(){
        this.valor = valor;
        return valor * 5.18;
    }

    @Override
    public void info(){
        System.out.println("Valor Total: " + this.getValor());
    }

}