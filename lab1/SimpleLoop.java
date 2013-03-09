public class SimpleLoop
{
   public static int sum(int low, int high)
   { int sum=0;
     for(int i=low;i<(high+1);i++)
     { sum += i; }
     return sum;
   }
}
