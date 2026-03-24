import java.util.Scanner;
public class Task11 {
    static int sumarray(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sumarray(arr, i + 1);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        int sum = sumarray(arr, 0);
        System.out.println("Sum of array: " + sum);
        sc.close();}
}