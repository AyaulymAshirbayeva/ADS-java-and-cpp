import java.util.Scanner;

public class Task3{
    static int numbersum(int n){
        if (n==0) return 0;
        return n + numbersum(n - 1);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        int sum = numbersum(n);
        System.out.print(sum);
        sc.close();
    }
}
