package banco;

import java.util.ArrayList;

public class Cofrinho {
    ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    public void adicionar(Real moeda) {
        listaMoedas.add(moeda);
    }

    public void adicionar(Euro moeda) {
        listaMoedas.add(moeda);
    }

    public void adicionar(Dolar moeda) {
        listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

    public void listagemMoedas() {
        for (Moeda moeda : listaMoedas) {
            moeda.info();
        }
    }

    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();

        }
        return total;
    }
}