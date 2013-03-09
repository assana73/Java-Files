import java.util.NoSuchElementException;
import java.util.Iterator;
import java.lang.Iterable;
public class UnboundedIntegerRangeIterator
implements Iterator<Integer>, Iterable<Integer>
{ private int range;

  public UnboundedIntegerRangeIterator(int low)
  { this.range=low;  }
  
  public void remove()
  { throw new UnsupportedOperationException();  }
  
  public Integer next()
  { if(this.hasNext())
    { return (range++);  }
	throw new NoSuchElementException();
  }
  
  public boolean hasNext()
  {
	return true;
  }  
  public Iterator<Integer> iterator()
  { return this;  }
}
