public class LeftRotate
{
    public static void main(String[] args) {
        int A[]={1,3,4,56,7};
        int temp=A[A.length-1];
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println(" ");

        for(int i=A.length-1;i>0;i--)
        {
            A[i]=A[i-1];
        }
        A[0]=temp;
        for(int y:A)
        {
            System.out.print(y+" ");
        }
    }
}
