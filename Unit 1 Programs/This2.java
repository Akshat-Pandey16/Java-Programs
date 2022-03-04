class A3{
    A3(){
        System.out.println("Default Constructor");
    }
    A3(int n){
        this();
        System.out.println("Paramaterized Constructor");
    }
    A3(int i,int j){
        this(100);
        System.out.println("Double Paramaterized Constructor");
    }
}

public class This2 {
    public static void main(String[] args) {
        A3 obj1 = new A3();
        System.out.println("");
        A3 obj2 = new A3(10);
        System.out.println("");
        A3 obj3 = new A3(100, 200);
    }
}