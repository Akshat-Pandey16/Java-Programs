public class StaticQuestion {
    static int i=10;
    static{
        m1();
        System.out.println("1st Static Block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main Method");
    }
    static void m1(){
        System.out.println("J = " + j);
    }
    static{
        System.out.println("2nd Static Block");
    }
    static int j=20;
}
