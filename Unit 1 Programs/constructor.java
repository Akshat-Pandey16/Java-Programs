class constructor1{
    int n;
    void filln(int n){
        this.n=n;
    }
    void show(){
        System.out.println("n = "+n);
    }
    constructor1(int n){
        this.n=n;
        System.out.println("Parameterized Constructor");
    }             //initialize constructor
    constructor1(){
        this(200);          //calling constructor from constructor
        System.out.println("Default Constructor");
    }
}
public class constructor {
    public static void main(String[] arg){
        constructor1 obj1=new constructor1();
        //A obj1=new A(100);
        //obj1.filln(50);
        obj1.show();
    }
}
