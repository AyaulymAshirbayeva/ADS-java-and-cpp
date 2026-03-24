import java.util.Scanner;
public class Task9 {
    static int fibo(int n){
    if (n==0) return 0;
    if (n==1) return 1;
    return fibo(n-1) + fibo(n-2);}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int f = fibo(n);
        System.out.print(f);
        sc.close();
    }
}