package banco;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        this.valor = valor;
        return valor;
    }

    @Override
    public void info() {
       this.valor = valor;
       System.out.println("Informação do Real: " + valor);
    }
}