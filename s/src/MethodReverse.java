public class MethodReverse
{
    static int rev(int n)
    {
        int a=0;
        while(n>0)
        {
            int rem=n%10;
             a=a*10+rem;
            n=n/10;
        }
         return a;


    }
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }
}
