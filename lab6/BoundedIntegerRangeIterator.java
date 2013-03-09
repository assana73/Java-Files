import java.util.NoSuchElementException;
import java.util.Iterator;

public class BoundedIntegerRangeIterator
implements Iterator<Integer>, Iterable<Integer>
{ private int low,high,index;

  public BoundedIntegerRangeIterator(int low,int high)
  { this.low=low;
	this.high=high;
	this.index=low;
  }
  
  public void remove()
  { throw new UnsupportedOperationException();  }
  
  public boolean hasNext()
  {
	return (index<high);
  }
  
  public Integer next()
  { if(this.hasNext())
    { return (index++);  }
	throw new NoSuchElementException();
  }
  
  public Iterator<Integer> iterator()
  { return this;  }
  
}
