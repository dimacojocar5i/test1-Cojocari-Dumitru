import java.util.Scanner;

public class Ex8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți ora actuală: ");
        int hour = scanner.nextInt();
        String timeDay;

        switch (hour) {
            case 1:
            case 2:
            case 3:
                timeDay = "dupa miezul noptii";
                break;
            case 4:
            case 5:
            case 6:
                timeDay = "dimineata devreme";
                break;
            case 7:
            case 8:
            case 9:
                timeDay = "dimineata";
                break;
            case 10:
            case 11:
            case 12:
                timeDay = "pina la prinz";
                break;
            case 13:
            case 14:
            case 15:
                timeDay = "dupa prinz";
                break;
            case 16:
            case 17:
            case 18:
                timeDay = "seara";
                break;
            case 19:
            case 20:
            case 21:
                timeDay = "seara tirziu";
                break;
            case 22:
            case 23:
            case 24:
                timeDay = "pina la miezul noptii";
                break;
            default:
                timeDay = "ora necunoscuta";
                break;

        }
        System.out.println("Conform orei actuale la moment este " + timeDay);

    }
}
