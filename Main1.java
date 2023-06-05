import java.util.Arrays;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[20];
        Random random = new Random();

        // Заповнення масиву випадковими числами від 0 до 9
        for (int i = 0; i < 20; i++) {
            randomNumbers[i] = random.nextInt(10);
        }

        System.out.println("Початковий масив: " + Arrays.toString(randomNumbers));

        // Заміна непарних елементів на 0
        for (int i = 1; i < 20; i += 2) {
            randomNumbers[i] = 0;
        }

        System.out.println("Масив після заміни: " + Arrays.toString(randomNumbers));
    }
}