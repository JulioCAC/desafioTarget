import java.util.Scanner;

public class Fibonacci {

    public boolean pertenceFibonacci(int numero) {
        if (numero < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == numero || numero == 0;
    }

    public void verificarNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        boolean pertence = pertenceFibonacci(numero);

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
