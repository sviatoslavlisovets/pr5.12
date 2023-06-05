import java.util.Arrays;
import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        int[][] matrix = new int[15][];

        Random random = new Random();

        // Ініціалізація розмірів рядків масиву
        for (int i = 0; i < 15; i++) {
            if (i >= 0 && i <= 3) {
                matrix[i] = new int[5];
            } else if (i >= 4 && i <= 7) {
                matrix[i] = new int[8];
            } else if (i >= 8 && i <= 11) {
                matrix[i] = new int[3];
            } else if (i >= 12 && i <= 14) {
                matrix[i] = new int[9];
            }
        }

        // Заповнення масиву випадковими числами від 0 до 15
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(16);
            }
        }

        // Виведення масиву у консоль
        for (int i = 0; i < 15; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
