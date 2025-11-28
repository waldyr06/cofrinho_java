package banco;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        this.valor = valor;
        double valorConvertido = valor * 6.18;
        return valorConvertido;
    }

    @Override
    public void info() {
        this.valor = valor;
        System.out.println("Informação Euro: " + valor);
    }
}