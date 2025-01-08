import java.util.Scanner;
class IfElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month");
        int month = sc.nextInt();
        String Season;
        if (month==12||month==1||month==2)
            Season = "Winter";
        else if (month==3||month==4||month==5)
            Season = "Spring";
        else if (month==6||month==7||month==8)
            Season = "Autumn";
        else
            Season = "Bogus Month";

        System.out.println(Season +" season.");
    }
}