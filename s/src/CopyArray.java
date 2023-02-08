public class CopyArray
{
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int B[]=new int[4];
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println(" ");
        for(int i=0;i<A.length;i++)
        {
             B[i]=A[i];
        }
        for(int x:B)
        {
            System.out.print(x+" ");
        }
    }
}
