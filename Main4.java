import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[15];
        Random random = new Random();

        // Заповнення масиву випадковими числами від 0 до 10
        for (int i = 0; i < 15; i++) {
            randomNumbers[i] = random.nextInt(11);
        }

        System.out.println("Масив: " + java.util.Arrays.toString(randomNumbers));

        int evenCount = 0;
        for (int num : randomNumbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Кількість парних елементів: " + evenCount);
    }
}