public class AgeCheck {
    public static void main(String[] arg){
        int age = Integer.parseInt(arg[0]);
        if(age<=15)
            System.out.println("You are a Child");
        else if(age>15 && age<=20)
            System.out.println("You are a Teenager");
        else
            System.out.println("You are a grown up man");
    }
}
