import java.util.Scanner;
public class Task14 {
    static boolean linearSearch(int[] arr, int i, int target) {
        if (i == arr.length) return false;
        if (arr[i] == target) return true;
        return linearSearch(arr, i + 1, target);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();
        boolean found = linearSearch(arr, 0, target);
        if (found) {
        System.out.println("Found");} 
        else {
        System.out.println("Not found");}
        sc.close();}
}