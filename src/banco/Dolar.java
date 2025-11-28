package banco;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converter(){
        this.valor = valor;
        double valorConvertido = valor * 5.18;
        return valorConvertido;
    }

    @Override
    public void info() {
        this.valor = valor;
        System.out.println("Informação do Dolar: " + valor);
    }
}