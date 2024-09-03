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
        System.out.println("d) Próximo elemento: 100 (quadrados dos numeros pares) ");
        System.out.println("e) Próximo elemento: 13 (fibonacci)");
        System.out.println("f) Próximo elemento: 200 (numeros que começam com a letra D)");

        System.out.println("Questão 5");
        System.out.println("1. Ligue o primeiro interruptor e deixe-o ligado por alguns minutos.");
        System.out.println("2. Desligue-o e ligue o segundo interruptor.");
        System.out.println("3. Vá até a sala das lâmpadas:");
        System.out.println("   - A lâmpada acesa está conectada ao segundo interruptor.");
        System.out.println("   - A lâmpada quente mas apagada está conectada ao primeiro interruptor.");
        System.out.println("   - A lâmpada fria e apagada está conectada ao terceiro interruptor.");


    }
}