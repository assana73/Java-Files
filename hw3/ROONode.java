public class ROONode
implements OONode
{ public String value;
  public OONode next;
  
  public ROONode(String v,OONode next)
  { this.value=v;
	this.next=next;
  }
  
  public OONode addToEnd(String v)
  { this.next=this.next.addToEnd(v);
    return this;
  } 
  
  public boolean isEnd()
  { return false;  }
  
  public void setNext(OONode newnext)
  { this.next=newnext;  }
   
  public OONode getNext()
  { return this.next;  }
  
  public String getStr()
  { return this.value;  }
}