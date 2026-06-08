

public class Ex9 {
    static void main(String[] args) {
        seasonDisplay(5);
    }
    public static void seasonDisplay (int month) {

        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "necunoscut";
                break;
        }
        System.out.println("It is the season " + season);

    }
}
