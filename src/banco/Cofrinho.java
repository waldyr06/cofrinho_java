package banco;

import java.util.ArrayList;

public class Cofrinho {
    //lista que armazena as moedas no cofrinho
    ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        //Pecorrrendo as moedas existentes no cofrinho
        for (Moeda m : listaMoedas) {
            //Comparando o que tá para entrar e o que temos
            if (m.getClass() == moeda.getClass()) {
                //se forem iguais ele vai somar com o valor antigo que estiver nela
                m.setValor(m.getValor() + moeda.getValor());
                return;
            }
        }
        //Cria uma nova moeda, que não será usada
        listaMoedas.add(moeda);
    }

    // Procura pela moeda do mesmo tipo e subtrai o valor informado
    public void remover(Moeda moeda) {
        for (Moeda m : listaMoedas) {
            if (m.getClass() == moeda.getClass()) {
                m.setValor(m.getValor() - moeda.getValor());
                return;
            }
        }
        listaMoedas.remove(moeda);
    }

    //Pega as moedas que temos e mostra cada uma e seus respectivos valores
    public void listagemMoedas() {
        for (Moeda m : listaMoedas) {
            System.out.println(m);
        }
    }

    //Converte cada moeda para real e soma ela ao total
    public void totalConvertido() {
        double total = 0;
        //Soma o resulltado da conversão de cada moeda
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        System.out.printf("Total em Reais: R$ %.2f", total);
        System.out.println("");
    }
}