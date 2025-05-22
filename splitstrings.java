import java.util.*;
public class splitstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Aditya is Java Developer";
        System.out.println("Enter a string:");
        char c = sc.next().charAt(0);
        int index = str.indexOf(c);
        System.out.println(str.substring(0, index));
        System.out.println(str.substring(index, str.length()));
       
    }   
}
