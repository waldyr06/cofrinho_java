package banco;

public class Euro extends Moeda{

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
        double valorConvertido = valor * 6.18;
        return valorConvertido;
    }

    @Override
    public void info() {}
}