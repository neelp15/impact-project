import java.util.*;
public class splitstrings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int a = str.replaceAll("[a-zA-Z0-9]", "").length();
        System.out.println(a);
    }
    
}
