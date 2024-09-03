import java.util.Scanner;

public class Letra {
    public void countLetterA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }

        }

        System.out.println("A letra 'a' aparece " + count + " vezes na string.");
    }
}
