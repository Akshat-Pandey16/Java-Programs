import org.w3c.dom.ls.LSOutput;

class A6
{
    private int ID;
    static int cnt=0;
    A6(){
        cnt++;
        ID=cnt;
        System.out.println("Object ID: "+ID+" created");
    }
    protected void finalize(){
        System.out.println("Object ID: "+ID+" destroyed");
    }
}
public class ProgComplete1
{
    static void test()
    {
        A6 ob1=new A6();
        A6 ob2=new A6();
        A6 ob3=new A6();
    }
    public static void main(String arg[])
    {
        test();
        System.gc();
    }
}

