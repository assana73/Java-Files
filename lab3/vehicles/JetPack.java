public class JetPack
  implements Vehicle
{ private String name;
  private int fuel;

  public JetPack()
  { name = new String("Doctor Zarkan");
    fuel = 10;
  }
  public JetPack(String name,int max)
  { this.name=new String(name);
    fuel=max;
  }

  public String travel()
  { if(fuel>0)
    { this.fuel--;
	  return (name+" soars through the sky. Fuel remaining: "+fuel);
	}
    else
    { return (name+" is grounded");  }
  }
}