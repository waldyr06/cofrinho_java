package banco;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }


    @Override
    public String toString() {
        return String.format("REAL - Valor: R$ %.2f", this.valor);
    }

    @Override
    public double converter() {
        this.valor = valor;
        return valor;
    }

    @Override
    public void info() {}
}