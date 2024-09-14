import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // اختيار رقم عشوائي بين 1 و 100
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 10;
        boolean hasWon = false;

        System.out.println("مرحبًا بك في لعبة 'احزر الرقم'!");
        System.out.println("لقد اخترت رقمًا بين 1 و 100. لديك 10 محاولات لتخمينه.");

        // اللعبة الرئيسية
        while (attempts < maxAttempts) {
            System.out.print("أدخل تخمينك: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("الرقم أكبر!");
            } else if (guess > randomNumber) {
                System.out.println("الرقم أصغر!");
            } else {
                hasWon = true;
                break;
            }

            System.out.println("تبقت لك " + (maxAttempts - attempts) + " محاولات.");
        }

        // نتيجة اللعبة
        if (hasWon) {
            System.out.println("مبروك! لقد خمنت الرقم الصحيح في " + attempts + " محاولة.");
        } else {
            System.out.println("للأسف، لقد خسرت. الرقم الصحيح كان " + randomNumber);
        }

        scanner.close();
    }
}
