// for(;;){}
// for (initialisation, condition, iteration);
// comma operator;
// for (a=1, b=6; a<b; a++, b--){}

class comma_operator{
    public static void main(String args[]){
        for (int a = 1, b =6; a<b; a++, b--){
            System.out.println(a+ " " +b);
        }
    }
}