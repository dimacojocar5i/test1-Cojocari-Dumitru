import java.util.Scanner;

public class Ex19 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o litera din urmatoarea lista: ");
        System.out.print("[R, ");
        System.out.print("G, ");
        System.out.print("V]");
        String litera = scanner.nextLine();
        litera = litera.toUpperCase();

        switch (litera) {
            case "R":
                System.out.println("Rosu");
                break;
            case "G":
                System.out.println("Galben");
                break;
            case "V":
                System.out.println("Verde");
                break;
            default:
                System.out.println("Necunoscut");
                break;
        }
        scanner.close();

    }
}
