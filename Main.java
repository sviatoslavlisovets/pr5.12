public class Main {
    public static void main(String[] args) {
        int size = 50; // Розмір масиву (половина від 99)

        int[] oddNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            oddNumbers[i] = (i * 2) + 1;
        }

        // Виведення масиву у стовпчик
        for (int i = 0; i < size; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}