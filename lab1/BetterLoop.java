public class BetterLoop
{
   public static boolean contains(int [] values, int v)
    { for(int i=0;i<(values.length);i++)
      { if(values[i]==v)
        { return true;  }
      }
      return false;
    }
}
