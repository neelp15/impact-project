public class palindrome {
    public static void main(String[] args) {
        String s = "NITIN";
        String s2 = "";
        for (int i= s.length()-1; i >=0; i--){
            s2 += s.charAt(i);
        }
        if (s.equals(s2)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}