public class oops {
    int x;
    static int y;
    void show(){
        x = x+1;
        y = y+1;
        System.out.println(x + " " + y);
    }
    public static void main(String[] args){
        oops o = new oops();
        o.show();
        oops o1 = new oops();
        o1.show();
        oops o2 = new oops();
        o2.show();
        
    }
    
}
