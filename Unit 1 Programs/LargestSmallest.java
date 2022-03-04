import java.util.Scanner;
public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,n=0;
        System.out.println("Enter the length of Array : ");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter elements in the array : ");
            arr[i]=sc.nextInt();
        }
        a=arr[0];
        //for greatest number
        for(int i=1;i<n;i++){
            b=arr[i];
            if(a>b)
                continue;
            else
                a=b;
        }
        System.out.println("Greatest element is : " + a);
        //for smallest number
        a=arr[0];
        for(int i=1;i<n;i++){
            b=arr[i];
            if(a<b)
                continue;
            else
                a=b;
        }
        System.out.println("Smallest element is : " + a);
    }
}
