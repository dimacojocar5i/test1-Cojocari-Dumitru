import java.util.Scanner;

public class Ex12 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti virsta: ");
        int age = scanner.nextInt();

        if (age == 0) {
            System.out.println("Virsta incorecta!");
        }
        else if (age < 12) {
            System.out.println("Sunteti  copil");
        }
        else if (age < 18) {
            System.out.println("Sunteti adolescent!");
        }
        else if (age <= 135) {
            System.out.println("Sunteti adult!");
        }
        else {
            System.out.println("Necunoscut");
        }
        scanner.close();
    }
}
