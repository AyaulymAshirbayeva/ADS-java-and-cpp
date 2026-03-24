import java.util.Scanner;
public class Task5{
    static int numpow(int a, int b){
        if (b < 0) {
        System.out.println("b must not be negative");
         return -1;
    }
        if (b == 0) return 1;
        return a * numpow(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();
        int pow = numpow(a, b);
        System.out.print(pow);
        sc.close();
    }
} 