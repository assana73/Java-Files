public class Moped
  implements Vehicle
{ private String name;

  public Moped()
  { name= new String("Bob");  }
  public Moped(String name)
  { this.name=new String (name);  }

  public String travel()
  { return (name+" putt-putts along the road.");  }
}