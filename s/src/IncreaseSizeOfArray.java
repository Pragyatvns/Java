public class IncreaseSizeOfArray
{
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int B[]=new int[2*A.length];
        System.out.println(A.length);
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
            A=B;

        }
        System.out.println(A.length);
    }
}
