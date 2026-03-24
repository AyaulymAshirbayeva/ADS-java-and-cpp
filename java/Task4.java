import java.util.Scanner;
public class Task4{
    static int factorial(int n){
        if (n==0 || n==1) return 1;
        return n * factorial(n - 1);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n=sc.nextInt();
        int fac = factorial(n);
        System.out.print(fac);
        sc.close();}
}