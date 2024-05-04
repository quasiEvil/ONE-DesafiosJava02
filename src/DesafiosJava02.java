import java.util.Scanner;

public class DesafiosJava02 {
    public static void main(String[] args) {
        System.out.println("\n===================================");
        System.out.println("RESOLUÇÃO DOS DESAFIOS DE JAVA # 02");
        System.out.println("===================================\n");

        Scanner scanner = new Scanner(System.in); // Inicializa o Scanner para solicitar inputs do usuário

        // Crie um programa que solicite ao usuário digitar um número.
        // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        System.out.println("DESAFIO 01 - NÚMERO POSITIVO OU NEGATIVO");
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }

        System.out.println();
        System.out.println("============================\n");

        // Peça ao usuário para inserir dois números inteiros.
        // Compare os números e imprima uma mensagem indicando se são iguais, diferentes,
        // o primeiro é maior ou o segundo é maior.
        System.out.println("DESAFIO 02 - COMPARANDO DOIS NÚMEROS INTEIROS");
        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os dois números são IGUAIS.");
        } else {
            System.out.println("Os dois números são DIFERENTES.");
        }

        if (numero1 != numero2){
            if (numero1 > numero2) {
                System.out.println("O primeiro número é MAIOR do que o segundo.");
            } else {
                System.out.println("O segundo número é MAIOR do que o primeiro.");
            }
        }

        System.out.println();
        System.out.println("============================\n");

        // Crie um menu que oferece duas opções ao usuário:
       // "1. Calcular área do quadrado" e "2. Calcular área do círculo".
       // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("DESAFIO 03 - CALCULAR A ÁREA DO QUADRADO OU DO CÍRCULO");
        int opcoes = -1; // -1 Para entrar no while loop

        while (opcoes < 1 || opcoes > 2) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1. Calcular área de um quadrado");
            System.out.println("2. Calcular área de um círculo");
            System.out.println("Digite \"1\" ou \"2\"");
            if(scanner.hasNextInt()) {
                opcoes = scanner.nextInt();
            }
        }

        switch (opcoes) {
            case 1:
                System.out.println("Digite a altura do quadrado:");
                double alturaQuadrado = scanner.nextDouble();
                System.out.println("Digite a largura do quadrado:");
                double larguraQuadrado = scanner.nextDouble();
                double areaQuadrado = alturaQuadrado * larguraQuadrado;
                System.out.println("A área do quadrado é " + areaQuadrado + " metros.");
                break;

            case 2:
                double pi = 3.14;
                System.out.println("Digite o raio do círculo:");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = (pi * (raioCirculo * raioCirculo));
                System.out.println("A área do círculo é " + areaCirculo + " metros.");
        }

        System.out.println();
        System.out.println("============================\n");

       // Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("DESAFIO 04 - TABUADA");
        System.out.println("Digite um número para visualizar a tabuada dele:");
        int numeroTabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + numeroTabuada * i );
        }

        System.out.println();
        System.out.println("============================\n");

        // Crie um programa que solicite ao usuário a entrada de um número inteiro.
        // Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        System.out.println("DESAFIO 05 - NÚMERO PAR OU ÍMPAR");
        System.out.println("Digite um número inteiro:");
        int ParOuImpar = scanner.nextInt();

        if (ParOuImpar % 2 == 0) {
            System.out.println("O número digitado é PAR.");
        } else {
            System.out.println("O núimero digitado é ÍMPAR.");
        }

        System.out.println();
        System.out.println("============================\n");

        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.println("DESAFIO 06 - FATORIAL");
        System.out.println("Digite um número inteiro:");
        int fatorial = scanner.nextInt();
        int resultado = calcularFatorial(fatorial);
        System.out.println("O fatorial de " + fatorial + " é: " + resultado);
    }

    public static int calcularFatorial(int num) {
        int n = 1;
        for (int i = 1; i <= num; i++) {
            n *= i;
        }
        return n;
    }
}