/*
2.1 Write a program in Java to demonstrate the application of various types
of constructors and the Finalize method
*/
class A{
    int v1;
    A(){
        v1=0;
        System.out.println("Default Constructor");
    }
    A(int n){
        v1=n;
        System.out.println("Parameterized Constructor");
    }
    void show(){
        System.out.println("v1= "+v1);
    }
    protected void finalize(){
        v1=0;
        System.out.println("Finalize Called");
    }
}
public class AutomaticGarbageCollection{
    static void test(){
        A ob1=new A();
        A ob2= new A(100);
        ob1.show();
        ob2.show();
    }
    public static void main(String[] arg){
        test();
        System.gc();            //garbage collection
    }
}