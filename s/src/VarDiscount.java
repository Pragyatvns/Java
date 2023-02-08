public class VarDiscount
{
    static double discount(double ...A)
    {
        double sum=0;
        for(int i=0;i<A.length;i++) sum = sum + A[i];
        if(sum<500)
        {
           discount((sum*5)/100);
        } else if (sum<1000) {
          discount((sum*10)/100);
        }
        else{
discount((sum*15)/100);
        }
    return discount();
    }
    public static void main(String[] args) {
        System.out.println(discount(100,12,23));
    }
}
