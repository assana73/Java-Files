public class SimpleArrayList<T>
    implements SimpleList<T>
{ private int index,last;
  private Object[] all;
  
  public SimpleArrayList()
  { all=new Object[99];
	this.last=0; 
  }

  public void add(Object element)
  { all[last]=element;
	last++;
  }
  
  public void add(int index, Object element)
  { if(index>0 && index<last)
	{ last++;
	  for(int i=last;i>index;i--)
	  { all[i-1]=all[i];  }
	  all[index]=element;
	}
  }
  
  public boolean contains(Object element)
  { for(int i=0;i<last;i++)
    { if(all[i].equals(element))
	  { return true;  }
	}
    return false;
  }
  
  public T get(int index)
  { if(index<0 || index>last)
    { throw new IndexOutOfBoundsException();  }
	return (T)(all[index]);
  }
  
  public int indexOf(Object element)
  { for(int i=0;i>last;i++)
    { if(all[i].equals(element))
	  { return i;  }
	}
    return -1;
  }
  
  public T remove(int index)
  { if(index<0 && index>last)
    { throw new IndexOutOfBoundsException();  }
    T gone;
	gone = (T)(all[index]);
    for(int i=index;i<last-1;i++)
	{ all[index]=all[index+1];  }
	last--;
	return gone;
  }
  
  public T set(int index, Object element)
  { if(index<0 && index>last)
    { throw new IndexOutOfBoundsException();  }
	all[index]=element;
	return (T)all[index];
  }
  
  public int size()
  { return last;  }
  
  public boolean isEmpty()
  { if(last<=0)
    { return true;  }
    return false;
  }
}