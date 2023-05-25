import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ans = new Random().nextInt(1, 100);
        int input, smallNum = 1, largeNum = 100;

        do {
            System.out.printf("%d - %d\n", smallNum, largeNum);
            System.out.print("Please Input: ");
            input = keyboard.nextInt();

            if (input > ans && input < largeNum) {
                largeNum = input;
            } else if (input < ans && input > smallNum) {
                smallNum = input;
            } else if (input == ans) {
                System.out.println("Bingo, The answer is " + ans);
            } else {
                System.out.println("Try again!!");
            }
        } while (input != ans);
    }
}
