import java.util.Scanner;

public class Ex7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar la alegere: ");
        double number = scanner.nextDouble();

        if (number % 2 == 0) {
            System.out.println("Acest numar este par!");
        }
        else {
            System.out.println("Acest numar este impar!");
        }
    }
}
