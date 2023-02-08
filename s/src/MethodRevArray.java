public class MethodRevArray
{
    static void rev(int A[])
    {

        int B[]=new int[5];
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        for(int x:B)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
     int A[]={2,4,6,8,1};
        rev(A);
    }
}
