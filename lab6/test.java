import java.util.Iterator;

public class test
{ 
  public static void main(String [] args)
  { BoundedIntegerRangeIterator iter1=new BoundedIntegerRangeIterator(3,6);
    Iterator<Integer> iter2=new UnboundedIntegerRangeIterator(2);
	TakeIterator<Integer> iter3=new TakeIterator<Integer>(5,iter2);

	Iterator<Integer> iter=iter1.iterator();
	while(iter.hasNext())
	{ Integer s=iter.next();
      Check.check((Object)s,3);
	}
  
/*
	for (Integer i : new UnboundedIntegerRangeIterator(0))
	{ System.out.println(i);  }
*/
  
	Check.check((Object)iter2.next(),3);
	Check.check((Object)iter2.next(),4);
	Check.check((Object)iter2.next(),5);
	Check.check((Object)iter2.next(),6);

	for (Integer i : iter3)
	{ System.out.println(i);  }
  }
}
