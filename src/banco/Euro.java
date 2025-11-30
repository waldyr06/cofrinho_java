package banco;

public class Euro extends Moeda {

    public static final double TAXA_EURO = 6.18;

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return String.format("Euro - Valor: R$ %.2f", this.valor);
    }

    @Override
    public double converter() {
        this.valor = valor;
        return valor * TAXA_EURO;
    }

    @Override
    public void info() {
        System.out.println("Valor Total: " + this.getValor());
    }
}