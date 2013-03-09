public class OddFilter
    implements Filter<Integer>
{
  public boolean accept(Integer i)
  { return (i&0x1)==1;  }
}