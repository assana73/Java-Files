public class IONonEmptyNode
implements IONode
{ public String value;
  public IONode next;
  
  public IONonEmptyNode(String v,IONode next)
  { this.value=v;
	this.next=next;
  }
  
  public IONode addToEnd(String v)
  { this.next=this.next.addToEnd(v);
    return this;
  } 
  
  public boolean isEnd()
  { return false;  }
  
  public void setNext(IONode newnext)
  { this.next=newnext;  }
   
  public IONode getNext()
  { return this.next;  }
  
  public String getStr()
  { return this.value;  }
}