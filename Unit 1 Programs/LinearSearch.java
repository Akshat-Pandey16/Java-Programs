
import java.util.Scanner;

//Write a program to demonstrate rhe application of array for searching.

public class LinearSearch{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int N=0, key=0, i=0;
        boolean found=false;
        System.out.println("Enter the length of array: ");
        N=sc.nextInt();
        int[] ar=new int[N];
        for(i=0;i<N;i++){
            System.out.println("Enter a number: ");
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter number to be searched: ");
        key=sc.nextInt();
        for(i=0;i<N;i++){
            if(key==ar[i]){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("value: "+key+"Found at the index: "+i);
        }
        else{
            System.out.println("value not found "+key);
        }
    }
}
        
        
        