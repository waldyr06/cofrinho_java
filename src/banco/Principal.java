package banco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();

        System.out.println("------------------------------------------------");
        System.out.println("Bem vindo ao cofrinho java seguro...");
        System.out.println("------------------------------------------------");

        boolean rodando = true;
        while (rodando == true) {

            System.out.println("------------------------------------------------");
            System.out.println("Digite o que deseja fazer aqui  no cofrinho java");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("5 - Encerrar");
            System.out.println("------------------------------------------------");

            try {
                int op = teclado.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("------------------------------------------------");
                        System.out.println("Escolha a moeda que será adicionada");
                        System.out.println("1 - Real");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Dolar");
                        System.out.println("------------------------------------------------");

                        int op2 = teclado.nextInt();
                        if (op2 == 1) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Digite o valor: ");
                            double valorReal = teclado.nextDouble();
                            System.out.println("------------------------------------------------");
                            cofre.adicionar(new Real(valorReal));
                            break;
                        }
                        if (op2 == 2) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Digite o valor: ");
                            double valorEuro = teclado.nextDouble();
                            System.out.println("------------------------------------------------");
                            cofre.adicionar(new Euro(valorEuro));
                            break;
                        }
                        if (op2 == 3) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Digite o valor: ");
                            double valorDolar = teclado.nextDouble();
                            System.out.println("------------------------------------------------");
                            cofre.adicionar(new Dolar(valorDolar));
                            break;
                        }
                    case 2:
                        System.out.println("------------------------------------------------");
                        System.out.println("Escolha qual moeda você quer remover um valor");
                        System.out.println("1 - Real");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Dolar");
                        System.out.println("------------------------------------------------");

                        int op3 = teclado.nextInt();
                        if (op3 == 1) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Digite o valor: ");
                            double valorReal = teclado.nextDouble();
                            System.out.println("------------------------------------------------");
                            cofre.remover(new Real(valorReal));
                            break;
                        }
                        if (op3 == 2) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Digite o valor: ");
                            double valorEuro = teclado.nextDouble();
                            System.out.println("------------------------------------------------");
                            cofre.remover(new Euro(valorEuro));
                            break;
                        }
                        if (op3 == 3) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Digite o valor: ");
                            double valorDolar = teclado.nextDouble();
                            System.out.println("------------------------------------------------");
                            cofre.remover(new Dolar(valorDolar));
                            break;
                        }
                    case 3:
                        if (op == 3) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Aqui tá a lista com todas as suas moedas");
                            cofre.listagemMoedas();
                            break;
                        }

                    case 4:
                        System.out.println("------------------------------------------------");
                        cofre.totalConvertido();
                        break;

                    case 5:
                        System.out.println("Fechando cofrinho...");
                        if (op == 5){
                            rodando = false;
                        }
                        break;
                    default:
                        System.out.println("Opção invalida");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro, você digitou a entrada errada: " + e.getMessage());
                System.out.println("------------------------------------------------");
                System.out.println("Diga: Escreva os valores inteiros ou use valores com virgula");
                teclado.nextLine();
            }
        }
    }
}