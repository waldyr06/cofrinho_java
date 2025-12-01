package banco;

public class Dolar extends Moeda{

    //Fazendo assim evito deixar um número mágico pelo código
    public static final double TAXA_DOLAR = 5.18;

    public Dolar(double valor) {
        super(valor);
    }

    //Deixando a saida formatada e mostrando o valor de fato e não a localização na memoria
    @Override
    public String toString() {
        return String.format("Dolar - Valor: US$ %.2f", this.valor);
    }

    @Override
    public double converter(){
        this.valor = valor;
        return valor * TAXA_DOLAR;
    }

    @Override
    public void info(){
        System.out.println("Valor Total: " + this.getValor());
    }
}