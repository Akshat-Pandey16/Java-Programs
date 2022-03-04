class A4{
    int n=0;           //instance data member
   static int cnt=0;            //class data member
//    int cnt=0;
    A4(){
        cnt++;
        System.out.println("Object Instance Created : " + cnt);
    }
//    static void f1(){                                  //class member method
//        System.out.println("cnt = " + cnt);
//        System.out.println("n = " + n);              //cannot access non static members from static
//        f2();                                       //cannot access non static function from static
//    }
    void f2(){
        System.out.println("cnt = " + cnt);
        System.out.println("n = " + n);             //non static can access non static
        //f1();
    }
    {
        //instance block
        //will be different for each instance
        System.out.println("Instance Block");
    }
    static{
        //static block
        //will be same for all instances, made only once
        //need atleast one instance block beforehand
        System.out.println("Static Block");
    }
}


public class StaticExample {
    public static void main(String[] args) {
        for(int i = 0;i < 5;i++){
            A4 ob1=new A4();
            //ob1.f2();
        }
    }
}
