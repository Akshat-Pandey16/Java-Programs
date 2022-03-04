import java.io.*;
public class InputfromBuff {
        public static void main(String[] arg)
        {
            //Creating instance of a class
            // class_name object_name = new class_name();
            // Constructor : member method bearing the class name
            InputStreamReader isr = new InputStreamReader(System.in);
            // isr is now connected to default i/p device (KB : System.in)
            // input from KB is raw byte-stream
            BufferedReader reader = new BufferedReader(isr);
            try
            {
                System.out.println("Enter Your Name: ");
                String str = reader.readLine();
                //reading byte-stream from isr and converting it into
                // String object, and we are assigning that into str
                System.out.println("WELCOME: "+str);
            }catch(Exception ex){}
        }
}
