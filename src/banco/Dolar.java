package banco;

public class Dolar extends Moeda{

    public static final double TAXA_DOLAR = 5.18;

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
        return valor * TAXA_DOLAR;
    }

    @Override
    public void info(){
        System.out.println("Valor Total: " + this.getValor());
    }
}