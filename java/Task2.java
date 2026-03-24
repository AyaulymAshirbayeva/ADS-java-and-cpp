import java.util.Scanner;

public class Task2 {
    static void numbers(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        numbers(n - 1);}
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        numbers(n);
        sc.close();
    }
}