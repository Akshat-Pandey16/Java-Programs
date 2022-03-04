
public class Add {
    public static void main(String[] arg){
        System.out.println("Number of values entered : " + arg.length);
        int sum1=0;
        for(int i=0;i<arg.length;i++){
            int a=Integer.parseInt(arg[i]);
            sum1=sum1+a;
        }
        System.out.println("Sum of the entered values is : "+sum1);
        System.out.println("Average of the entered values is : "+sum1/arg.length);
    }
}
