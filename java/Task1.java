import java.util.Scanner;
public class Task1 {
    static void numbers(int n) {
        if (n == 0) return;
        numbers(n - 1);
        System.out.print(n + " ");}
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        numbers(n);
        sc.close();}
}

