public class GreatestofInputs {
    public static void main(String[] arg) {
        int len = arg.length;
        System.out.println("Given number of inputs are : " + len);
        int a = Integer.parseInt(arg[0]);
        for (int i = 1; i < len; i++) {
            int b = Integer.parseInt(arg[i]);
            if (a > b)
                continue;
            else
                a = b;
        }
        System.out.println("Greatest among the given inputs is : " + a);
    }
}
