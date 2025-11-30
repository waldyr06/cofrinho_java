package banco;

public abstract class Moeda {
    double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public boolean setValor(double valor) {
        if (valor > valor || valor < 0){
            System.out.println("Você não pode remover mais do que já tem!!!");
            System.out.println("------------------------------------------------");

            return false;
        }
        this.valor = valor;
        return true;
    }

    public double getValor() {
        return valor;
    }

    public abstract double converter();
    public abstract void info();

    @Override
    public String toString() {
        return String.format("Moeda [Valor: %.2f]", valor);
    }
}