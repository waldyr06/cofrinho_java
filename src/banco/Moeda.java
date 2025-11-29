package banco;

import java.util.Objects;

public abstract class Moeda {
    double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("Moeda [Valor: %.2f]", valor);
    }

    public abstract double converter();
    public abstract void info();

}