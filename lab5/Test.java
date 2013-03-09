public class Test
{
    public static void main(String [] args)
    {
	  SimpleList<Integer> set=new SimpleArrayList<Integer>();
	  int f1,f2,f3,f4,f5;
	  f1=4;
	  set.add(f1);
	  f2=3;
	  set.add(f2);
	  f3=2;
	  set.add(f3);
	  f4=1;
	  set.add(f4);
	  f5=0;
	  set.add(f5);
	  
	  Check.check((double)set.get(0),4);
	  Check.check((double)set.get(1),3);
	  Check.check((double)set.get(2),2);
	  Check.check((double)set.get(3),1);
	  Check.check((double)set.get(4),0);
	  
	  Check.check((double)set.size(),5);
	  Check.check(set.contains(2),true);
	  Check.check(set.contains(1),true);
	  Check.check(set.contains(0),true);
	  Check.check((double)set.indexOf(1),3);
	  Check.check((double)set.set(1,5),5);
	  int f6=7;
	  set.add(2,f6);
	  Check.check((double)set.get(2),7);
	  Check.check((double)set.get(3),2);
	  Check.check((double)set.get(4),1);
	  Check.check((double)set.get(5),0);
	  Check.check((double)set.size(),6);
	  Check.check((double)set.remove(3),1);
    }
}