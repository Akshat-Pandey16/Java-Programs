class A7
{
    private int n;
    void setN(int i){
        i=n;
    }
    int getN(){
        return n;
    }
}
public class Swap
{
    static void swap(A7 i,A7 j){
        int temp;
        temp=i.getN();
        i.setN(j.getN());
        j.setN(temp);
    }
    public static void main(String arg[])
    {
        A7 i=new A7();
        A7 j=new A7();
        i.setN(10);
        j.setN(20);
        System.out.println("i="+i.getN()+" j="+j.getN()); // o/p:  i=10 j=20
        swap(i,j);
        System.out.println("i="+i.getN()+" j="+j.getN());// o/p:  i=20 j=10
    }
}