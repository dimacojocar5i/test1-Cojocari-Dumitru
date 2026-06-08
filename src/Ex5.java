import java.util.Scanner;

public class Ex5 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti parola: ");
        String password = scanner.nextLine();

        System.out.println("Parola este: " + password);
    }
}
