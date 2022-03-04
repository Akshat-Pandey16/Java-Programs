class B{
    //int v1=100;                                         //instance data member
    //static int v2=200;                                  //class data member
//    void f1(){                                          //instance data member
//        System.out.println("F1 Function");
//        System.out.println("V1 = " + v1);
//        System.out.println("V2 = " + v2);
//    }
    static void f2(){               //class member function
        System.out.println("F2 Function");
        //System.out.println("V1 = " + v1);             //non static members cannot be accessed inside static
        System.out.println("V2 = " + v2);
    }
//    {                                                   //instance block
//        System.out.println("Instance Block");
//        System.out.println("V1 = " + v1);
//        System.out.println("V2 = " + v2);
//    }
    static{                                             //static block
        System.out.println("Static Block");
        //System.out.println("V1 = " + v1);             //non static members cannot be accessed inside static
        //f2();
        //System.out.println("V2 = " + v2);
    }
    static int v2=200;                                  //output is 0 as top-down approach, first static block executed
}
public class StaticExample2 {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println("Printing from Main");
        B.f2();                                       //output will be non zero as called from main
    }
}
