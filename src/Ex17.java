public class Ex17 {
    static void main(String[] args) {
        int [] array = {45, 9, 8, 3, 56, 78, 96, 32, 4, 61};
        int number = array[0];
        for (int i = 1; i < array.length; i++) {
            if (number < array[i]) {
                number = array[i];
            }
        }
        System.out.println("Elementul cel mai mare din array: " + number);
    }
}
