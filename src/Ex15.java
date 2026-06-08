import java.util.Arrays;

public class Ex15 {
    static void main(String[] args) {

        byte [] array = {12, 45, 3, 6, 8, 98, 78, 51};
        System.out.println(Arrays.toString(array));
        array[4] = 65;
        System.out.println("Tabloul cu modificari la indicele 4: " + Arrays.toString(array));
    }
}
