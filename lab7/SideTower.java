public class SideTower
implements Tower
{ public int block;
  public Tower next;
  public Tower right;
  public Tower left;
  
  public SideTower(Tower next)
  { this.next=next;
    Tower n=new TopTower();
    Tower p=new TopTower();
	this.right=n;
	this.left=p;
	block=3;
  }
  
  public SideTower(int num,Tower next,Tower right,Tower left)
  { this.next=next;
    this.right=right;
	this.left=left;
	block=num;
  }
  
  public SideTower(int num,Tower next)
  { this.next=next;
	block=num;
  }
  
  public Tower addLevel()
  { this.next=this.next.addLevel();
    return this;
  }
  
  public Tower addSide()
  { this.next=this.next.addSide();
    return this;
  }
  
  public boolean check()
  { if(this.block>0)
    { return true;  }
	else
	{ return false;  }
  }
  
  public void setNext(Tower newnext)
  { this.next=newnext;  }
  
  public int sum()
  { return this.block+this.next.sum()+this.right.sum()+this.left.sum();  }
  
  public int levelUp()
  { int tot=this.next.levelUp()+this.right.levelUp()+this.left.levelUp();
    if(this.block==3)
    { tot+=1;  }
    return tot;  }
}