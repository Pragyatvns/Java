public class RightRotate
{
    public static void main(String[] args) {
        int A[]={1,2,34,4,56,7};
        int temp=A[0];
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println("");

        for(int i=1;i<A.length;i++)
        {
         A[i-1]=A[i];
        }
       A[A.length-1]=temp;
        for(int y:A){
            System.out.print(y+" ");
        }
    }
}
