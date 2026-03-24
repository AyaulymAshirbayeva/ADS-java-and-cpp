import java.util.Scanner;
public class Task16bonus {
    static int binary(int[] arr, int target, int left, int right) {
        if (left > right) return -1; 
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) return binary(arr, target, mid + 1, right);
        else return binary(arr, target, left, mid - 1);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();
        int index = binary(arr, target, 0, n - 1);
        if (index != -1) {
            System.out.println("Element found at index " + index);}
         else {
            System.out.println("Element not found");}
        sc.close();}
}