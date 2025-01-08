
import java.util.Scanner;
class calc{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        float i = sc.nextInt();
        System.out.println("Enter num2");
        float j = sc.nextInt();

        
        System.out.println("enter + - * / %");
        String s = sc.next();

        switch(s){
            case "+" : System.out.println("addition is "+(i+j));
                break;
            case "-" : System.out.println("Subtraction is "+(i-j));
                break;
            case "*" : System.out.println("Multiplication is "+(i*j));
                break;
            case "/" : System.out.println("Division is "+(i/j));
                break;
            case "%" : System.out.println("Modulus is "+(i%j));
                break;
            default  : System.out.println("error");
        }
    }
}
