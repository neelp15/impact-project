class kaprekarnumber{
public static void main(String[] args) {
    int n = 45;
    int sq = n*n;
    int len = String.valueOf(sq).length();
    int left = sq/(int)Math.pow(10, (len + 1)/2);
    int right = sq%(int)Math.pow(10, (len + 1)/2);
     if(left + right == n) {
        System.out.println("Kaprekar's Number");
    }else{
        System.out.println("Not a Kaprekar's Number");
    }
}
}