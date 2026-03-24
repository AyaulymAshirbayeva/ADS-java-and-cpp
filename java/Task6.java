import java.util.Scanner;
public class Task6 {
    static int sumdigits(int n){
    if (n==0) return 0;
    return n % 10 + sumdigits(n/10);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int sum = sumdigits(n);
        System.out.print(sum);
        sc.close();
    }
}