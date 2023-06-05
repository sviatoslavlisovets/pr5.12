import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];

        Random random = new Random();

        // Заповнення масивів випадковими числами від 0 до 5
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(6);
            array2[i] = random.nextInt(6);
            array3[i] = random.nextInt(6);
        }

        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));
        System.out.println("Масив 3: " + Arrays.toString(array3));

        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);
        double average3 = calculateAverage(array3);

        if (average1 > average2 && average1 > average3) {
            System.out.println("Середнє значення масиву 1 є більшим");
        } else if (average2 > average1 && average2 > average3) {
            System.out.println("Середнє значення масиву 2 є більшим");
        } else if (average3 > average1 && average3 > average2) {
            System.out.println("Середнє значення масиву 3 є більшим");
        } else {
            System.out.println("Середні значення масивів рівні");
        }
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}