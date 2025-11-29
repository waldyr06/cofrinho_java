package banco;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();
        System.out.println("Bem vindo ao cofrinho java seguro...");

        boolean rodando = true;
        while (rodando == true){

            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("5 - Encerrar");

            int op = teclado.nextInt();

            switch (op){
                case 1:
                    System.out.println("1 - Real");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Dolar");
                    int op2 = teclado.nextInt();
                    if (op2 == 1) {
                        System.out.println("Digite o valor: ");
                        double valorReal = teclado.nextDouble();
                        cofre.adicionar(new Real(valorReal));
                    } else if (op2 == 2) {
                        System.out.println("Digite o valor: ");
                        double valorEuro = teclado.nextDouble();
                        cofre.adicionar(new Euro(valorEuro));
                    } else {
                        System.out.println("Digite o valor: ");
                        double valorDolar = teclado.nextDouble();
                        cofre.adicionar(new Dolar(valorDolar));
                    }
                    break;
                case 2:
                    System.out.println("1 - Real");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Dolar");
                    int op3 = teclado.nextInt();
                    if (op3 == 1) {
                        System.out.println("Digite o valor: ");
                        double valorReal = teclado.nextDouble();
                        cofre.remover(new Real(valorReal));
                    } else if (op3 == 2) {
                        System.out.println("Digite o valor: ");
                        double valorEuro = teclado.nextDouble();
                        cofre.remover(new Euro(valorEuro));
                    } else {
                        System.out.println("Digite o valor: ");
                        double valorDolar = teclado.nextDouble();
                        cofre.remover(new Dolar(valorDolar));
                    }
                    break;
                case 3:
                    if (op == 3){
                        System.out.println("Lista: ");
                        cofre.listagemMoedas();
                    }
                    break;
                case 4:
                    System.out.println("Calculando o total: ");
                    cofre.totalConvertido();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção invalida");

            }
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("5 - Encerrar");
        }
    }
}