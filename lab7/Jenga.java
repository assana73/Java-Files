public class Jenga
{ public static Tower bottom;
  
  public Jenga()
  { this.bottom = new TopTower();  }
  
  public void addLevel()
  { this.bottom=this.bottom.addLevel();  }
  
  public void addSide()
  { this.bottom=this.bottom.addSide();  }
    
  public static int sum()
  { int all=bottom.sum();
	return all;
  }
  
  public static int numLevel()
  { int val=bottom.levelUp();
	return val;
  }
}