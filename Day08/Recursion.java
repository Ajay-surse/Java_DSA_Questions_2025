package Day08;

public class Recursion {
    static int count=0;
    public static void Recursion1(){
        if(count == 4) return;
        System.out.println(count + "");
        count++;
        Recursion1();

    }

    public static void main(String[] args) {
        Recursion1();
        
    }
    
}
