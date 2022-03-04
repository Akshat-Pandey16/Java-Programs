import java.util.Scanner;


public class LinearSearch2 {
    static int search(double[] arr, int key){
        int n=0;
        n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key)
                return i;
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,key=0;
        System.out.println("Enter number of elements in array : ");
        n=sc.nextInt();
        System.out.println();
        double[] arr=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter elements in array : ");
            arr[i]=sc.nextDouble();
        }
        System.out.println("Enter Number to search : ");
        key=sc.nextInt();
        int x=search(arr,key);
        if(x==1)
            System.out.println("Element found");
        else
            System.out.println("Not Found");
    }
}
