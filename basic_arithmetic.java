//demonstrate the basic arithmetic operators.
class basic_arithmetic{
    public static void main(String args[]){
        int a = 1 + 1; //2
        int b = a*3; //6
        int c = b/4;
        int d = c - a;
        int e = -d;
        System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %d", a,b,c,d,e);
        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db/4;
        double dd = dc - a;
        double de = -dd;
        System.out.printf("a = %f, b = %f, c = %f, e = %f", da, db, dc, dd, de);
    }
}