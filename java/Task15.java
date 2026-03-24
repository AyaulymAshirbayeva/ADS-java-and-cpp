import java.util.Scanner;
public class Task15 {
    static boolean sort(int[] arr, int i) {
        if (i == arr.length - 1) return true; 
        if (arr[i] > arr[i + 1]) return false; 
        return sort(arr, i + 1);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        boolean sorted = sort(arr, 0);
        if (sorted) {
            System.out.println("Sorted");}
        else {
            System.out.println("Not sorted");}
        sc.close();}
}