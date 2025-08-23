import java.util.Scanner;
import java.util.InputMismatchException;

class BuscandoErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int valor = scanner.nextInt();

            if (valor >= 0) {
                System.out.println("Seu número é positivo");
            } else {
                System.out.println("Seu número é negativo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números inteiros!");
        }

        scanner.close();
    }
}
