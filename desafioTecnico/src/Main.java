import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 1");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.verificarNumero();
        System.out.println("Questão 2");
        Letra letra = new Letra();
        letra.countLetterA();
        System.out.println("Questão 3");
        Soma soma = new Soma();
        soma.calculateSoma();
        System.out.println("Questão 4");
        System.out.println("a) Próximo elemento: 9 (numeros impares)");
        System.out.println("b) Próximo elemento: 128 (potências de 2)");
        System.out.println("c) Próximo elemento: 49 (quadrados perfeitos)");
        System.out.println("d) Próximo elemento: 100, (quadrados dos numeros pares) ");
        System.out.println("e) Próximo elemento: 13 (fibonacci)");
        System.out.println("f) Próximo elemento: 200 (numeros que começam com D)");


    }
}