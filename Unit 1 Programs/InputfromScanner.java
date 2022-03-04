import java.util.Scanner;
public class InputfromScanner {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String str = sc.nextLine();
        System.out.print("WELCOME: "+str);
    }
}
