public class MethodArea
{
    static int area(int l,int b)
    {
        int area=l*b;
        return area;
    }
    static int area(int r)
    {
       int area= (int) (Math.PI*r*r);
       return area;
    }
    public static void main(String[] args)
    {
        System.out.println(area(2));
    }
}
