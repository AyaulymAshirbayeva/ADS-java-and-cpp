import java.util.Scanner;
public class Task12 {
    static int maxarray(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return Math.max(arr[i], maxarray(arr, i + 1));}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        int max = maxarray(arr, 0);
        System.out.println("Max element of array is " + max);
        sc.close();}
}