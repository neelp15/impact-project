import java.util.*;
public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 50){
            System.out.println("Pass");
        }else if(marks >= 60){
            System.out.println("Distinction");
        }else if(marks >=75){
            System.out.println("Merit");
        }else if(marks >= 90){
            System.out.println("Excellent");
        }
        }
    
}
