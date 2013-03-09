public class NotTopTower
implements Tower
{ public int block;
  public Tower next;
  
  public NotTopTower(Tower next)
  { this.next=next;
	block=3;
  }
  
  public NotTopTower(int num,Tower next)
  { this.next=next;
	block=num;
  }

  public boolean check()
  { if(this.block>0)
    { return true;  }
	else
	{ return false;  }
  }
  
  public Tower addLevel()
  { this.next=this.next.addLevel();
    return this;
  }
  
  public Tower addSide()
  { this.next=this.next.addSide();
    return this;
  }
  
  public int sum()
  { int tot=this.block+this.next.sum();
    return tot;
  }  
  
  public int levelUp()
  { int tot=this.next.levelUp();
    if(this.block==3)
    { tot++;  }
    return tot;
  }
  
  public void setNext(Tower newnext)
  { this.next=newnext;  }

}