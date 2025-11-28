package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {

    ArrayList<Moeda> listaMoedas = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);

    public void adicionar(Moeda moeda) {
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