public class reverseeverywordofstring {
    public static void main(String[] args) {
        String str = " Hello World I am Java";
        String str1 = "";
        for (int i=str.length(); i > 0; i--){
            str1 += str.charAt(i-1);
    }
    System.out.println(str1);
}       
}
