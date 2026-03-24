import java.util.Scanner;
public class Task7 {
    static int countdigitsifzero(int n){
    if (n==0) return 1;
    return countdigits(n);}
    
    static int countdigits(int n){
        if (n==0) return 0;
    return 1 + countdigits(n/10);}
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int count = countdigits(n);
        System.out.print(count);
        sc.close();
    }
}