
public class overloading {
    void show(int a){
        System.out.println("Wipro");
    }
    void show(String s){
        System.out.println("TCS");
    }
    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.show('a');       
    }
}

