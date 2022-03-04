public class Prg2 {
        public static void main(String[] arg)
        {
            System.out.println("Result before conversion= "+(arg[0]+arg[1]));// "123" + "456"
            // Using wrapper classes to convert String to numeric
            // Integer, Float, Double classes
            // parse methods are available to convert string to numeric
            float a = Float.parseFloat(arg[0]);//"123" converted to numeric 123
            float b = Float.parseFloat(arg[1]);//"456" converted to numeric 456
            float res = a + b;
            System.out.println("Result after conversion= "+res);
        }
    }
