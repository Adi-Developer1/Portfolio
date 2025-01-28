/*
class methods{
static boolean isPrime(int n)        //method for checking prime numbers
{
    for(int i=2;i<n/2;i++)
    {
        if(n%i==0)
            return false;
    }
    return true;
    
}
public static void main(String[] args) {
    System.out.println(isPrime(12));
}
}
*/
/*
class methods{
    static int findGcd(int x,int y){          //method for finding greatest common divisor of 2 numbers
        while(x!=y){
            if(x>y)
             x=x-y;
            else
             y=y-x;
        }
        return x;
    }
    public static void main(String[] args) {
        int m=56;
        int n=36;
        System.out.println(findGcd(m, n));
    }
}
*/
/*
class methods{
    static int max(int...A){               //method for finding max using varargs
       if(A.length==0)return Integer.MIN_VALUE;
       int max=A[0];
       for (int i = 0; i < A.length; i++) {
           if(A[i]>max)max=A[i];
       }
       return max;
    }
    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));
    }
}
*/
/*
class methods{
    static double area(double r){       //example of method overloading
        double a= 3.14*r*r;
        return a;
    }
    static float area(float l, float b){
        float a= l*b;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(area(4));
        System.out.println(area(3,5));
    }
}
*/