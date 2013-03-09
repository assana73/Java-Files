import java.util.NoSuchElementException;
import java.util.Iterator;

public class TakeIterator<T>
implements Iterator<T>, Iterable<T>
{ private int numTake,ind;
  Iterator<T> iter;
  
  public TakeIterator(int num,Iterator<T> iter)
  { this.numTake=num;
	this.iter=iter;
    ind=0;
  }
  
  public void remove()
  { throw new UnsupportedOperationException();  }  

  public T next()
  { if((ind<numTake)&&this.hasNext())
	{ ind++;return this.iter.next();  }
	throw new NoSuchElementException();
  }
  
  public boolean hasNext()
  { if(this.ind<this.numTake)
	{ if(this.iter.hasNext())
	  { return true;  }
	}
	return false;
  }
  
  public Iterator<T> iterator()
  { return this;  }
}
