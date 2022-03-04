class A1{
    public void f1(){
        System.out.println("f1() called");
    }
}

public class ArrayofObjects {
    public static void main(String[] arg){
        A1 arr[]=new A1[3];
        for(int i=0;i<3;i++){
            arr[i] = new A1();              //allocate memory to remove null pointer exception
            arr[i].f1();
        }
    }
}
