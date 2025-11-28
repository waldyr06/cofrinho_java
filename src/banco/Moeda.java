package banco;

public abstract class Moeda {

    double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converter();
    public abstract void info();

}