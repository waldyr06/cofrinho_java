package banco;

public class Real extends Moeda {

    //Aqui não precisamos usar uma variável para converter o valor
    public Real(double valor) {
        super(valor);
    }

    //Fazendo assim evito deixar um número mágico pelo código
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
    public void info() {
        System.out.println("Valor Total: " + this.getValor());
    }
}