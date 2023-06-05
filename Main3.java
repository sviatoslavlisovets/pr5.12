import java.util.Arrays;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        Random random = new Random();

        // Заповнення масивів випадковими числами від 0 до 10
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(11);
            array2[i] = random.nextInt(11);
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));
        System.out.println("Масив 3 (сума елементів масивів 1 та 2): " + Arrays.toString(array3));
    }
}