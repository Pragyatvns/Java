public class VarSum
{
    static int sum(int ...A)
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,10));
    }
}
