import java.util.Scanner;

public class Ex3 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        double number1 = scanner.nextDouble();
        System.out.print("Introduceti al doilea numar: ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double prod = number1 * number2;
        double cit = number1 / number2;
        double rest = number1 % number2;

        System.out.println("Suma numerelor este: " + sum);
        System.out.println("Diferenta numerelor este: " + difference);
        System.out.println("Produsul numerelor este: " + prod);
        System.out.printf("Citul numerelor este: " + "%.3f", cit);
        System.out.println();
        System.out.println("Restul celor doua numere este: " + rest);

        scanner.close();

    }
}
