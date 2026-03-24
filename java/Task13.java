import java.util.Scanner;
public class Task13 { 
    static int countOccurrences(int[] arr, int i, int target) { 
        if (i == arr.length) return 0; 
        int count;
        if (arr[i] == target) {
        count = 1;} 
        else {
        count = 0;}
        return count + countOccurrences(arr, i + 1, target); }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        System.out.print("target: ");
        int target = sc.nextInt();
        int count = countOccurrences(arr, 0, target);
        System.out.println("Number of occurrences: " + count);
        sc.close();
    }
}