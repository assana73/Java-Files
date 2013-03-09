public class TopTower
implements Tower
{ public int block;

  public TopTower()
  { block=3;  }
  
  public boolean check()
  { if(this.block>0)
    { return true;  }
	else
	{ return false;  }
  }
 
  public Tower addLevel()
  { Tower p=new TopTower();
    Tower n=new NotTopTower(this.block,p);
	return n;
  }

  public Tower addSide()
  { Tower p=new TopTower();
	Tower n=new SideTower(this.block,p);
	return n;
  }
  
  public int sum()
  { return this.block;  }
    
  public int levelUp()
  { if(this.block==3)
    { return 1;  }
	else
	{ return 0;  }
  }
}