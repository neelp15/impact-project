public class constructoroverloading {
    int a;
    String b;
    constructoroverloading(int a){
        System.out.println("TCS"+" "+a);
    }
    constructoroverloading(int a, String b){
        System.out.println(a+" "+"Wipro"+" "+b);
    }
    public static void main(String[] args) {
        constructoroverloading obj1 = new constructoroverloading(5);
        constructoroverloading obj2 = new constructoroverloading(5, "Java");
    }
    
}
