import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vnd = 23000;
        System.out.println("Enter Dollar");
        Scanner scanner = new Scanner(System.in);
        int dollar;
        dollar = scanner.nextInt() * vnd;
        System.out.println(dollar+" VND");
    }
}
