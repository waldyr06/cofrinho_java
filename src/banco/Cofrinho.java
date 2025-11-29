package banco;

import java.util.ArrayList;

public class Cofrinho {
    ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        for (Moeda m : listaMoedas) {
            if (m.getClass() == moeda.getClass()) {
                m.setValor(m.getValor() + moeda.getValor());
                return;
            }
        }
        listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        for (Moeda m : listaMoedas) {
            if (m.getClass() == moeda.getClass()) {
                m.setValor(m.getValor() - moeda.getValor());
                return;
            }
        }
        listaMoedas.remove(moeda);
    }

    public void listagemMoedas() {
        for (Moeda moeda : listaMoedas) {
            System.out.println(moeda);
        }
    }

    public void totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        System.out.printf("Total em Reais: %f", total);

    }
}