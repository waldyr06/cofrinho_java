package banco;

public class Euro extends Moeda {

    //Fazendo assim evito deixar um número mágico pelo código
    public static final double TAXA_EURO = 6.18;

    public Euro(double valor) {
        super(valor);
    }

    //Deixando a saida formatada e mostrando o valor de fato e não a localização na memoria
    @Override
    public String toString() {
        return String.format("Euro - Valor: € %.2f", this.valor);
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