package banco;

import java.util.Scanner;

public class Principal{
    public static <moeda> void main(String[] args){

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
                        Real r;
                        r = new Real(valorReal);
                        cofre.adicionar(r);
                    } else if (op2 == 2) {
                        System.out.println("Digite o valor: ");
                        double valorEuro = teclado.nextDouble();
                        Euro e;
                        e = new Euro(valorEuro);
                        cofre.adicionar(e);
                    } else {
                        System.out.println("Digite o valor: ");
                        double valorDolar = teclado.nextDouble();
                        Dolar d;
                        d = new Dolar(valorDolar);
                        cofre.adicionar(d);
                    }
                case 2:
                    //Remover
                    break;
                case 3:
                    //listarr moedas
                    break;
                case 4:
                    //Calcular total
                    break;
                case 5:
                    //Encerrar
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