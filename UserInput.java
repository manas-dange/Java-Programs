import java.util.Scanner;
class UserInput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int i=sc.nextInt();
        System.out.println("int i: "+i);

        System.out.println("Enter a float number");
        float f=sc.nextFloat();
        System.out.println("Float f: "+f);

        System.out.println("Enter a double number");
        double d=sc.nextDouble();
        System.out.println("Double d: "+d);

        System.out.println("Enter a string");
        String s = sc.next();
        System.out.println("String s: "+s);

        System.out.println("Enter a character");
        char c = sc.next().charAt(0);
        System.out.println("Char c: "+c);
        sc.close();
    }
}