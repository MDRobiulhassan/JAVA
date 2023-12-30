import java.util.Random;

public class NUmberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;
        System.out.println(randomNumber);

        randomNumber = rand.nextInt(6) + 5; // 5 to 10
        System.out.println(randomNumber);

        // math class
        randomNumber = (int) (Math.random() * 10);
        System.out.println(randomNumber);
    }
}
