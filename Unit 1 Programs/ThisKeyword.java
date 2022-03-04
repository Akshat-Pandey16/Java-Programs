class A2{
    void m(){
        System.out.println(this); //prints some reference
    }
}

public class ThisKeyword {
    public static void main(String[] arg){
        A2 obj=new A2();
        A2 obj1=new A2();
        System.out.println(obj); //prints the reference
        System.out.println(obj1);
        obj.m();
    }
}
