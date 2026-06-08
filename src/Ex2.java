import java.util.Scanner;

public class Ex2 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int number1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int number2 = scanner.nextInt();

        int prod = number1 * number2;
        System.out.println("Produsul celor doua numere este: " + prod);

        scanner.close();
    }
}
