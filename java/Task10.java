import java.util.Scanner;
public class Task10 { 
    static boolean palindrome(String s, int l, int r) { 
        if (l >= r) return true; 
        if (s.charAt(l) != s.charAt(r)) return false; 
        return palindrome(s, l + 1, r - 1); } 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("word: ");
        String s = sc.nextLine(); 
        sc.close();
        if (palindrome(s, 0, s.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    } }