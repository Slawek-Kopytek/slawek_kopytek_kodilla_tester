import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int min = 30;
        int max = 0;
        int sum = 0;
        int count = 0;
        Random random = new Random();

        while (sum < 5000) {
            int numbers = random.nextInt(31);
            sum += numbers;
            count++;
            if (numbers < min) {
                min = numbers;
            }
            if (numbers > max) {
                max = numbers;
            }
        }
        System.out.println("Sum:" + sum);
        System.out.println("Count: " + count);
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
    }
}
