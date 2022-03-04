public class InstanceBlock {
    int i=10;
    {                   //1st instance block
        m1();
        System.out.println("1st Instance Block");
    }
    InstanceBlock(){
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        InstanceBlock obj=new InstanceBlock();
        System.out.println("Main Method");
    }
    void m1(){
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);
    }
    {                   //2nd instance block
        System.out.println("2nd Instance Block");
    }
    static{                   //2nd instance block
        System.out.println("1st Static Block");
    }
    int j=20;
}
