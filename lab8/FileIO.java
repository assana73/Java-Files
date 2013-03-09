import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class FileIO
{ public static void main(String [] args) throws IOException
  { BufferedReader input=null;
	PrintWriter output=null;
	try
	{ input=new BufferedReader(new FileReader("input.txt"));
	  output=new PrintWriter(new FileWriter("output.txt"));
	  
	  String l;
	  while((l=input.readLine())!=null)
	  { output.println(l);  }
	}
	
	finally
	{ if(input!=null)
	  { input.close();  }
	  if(output!=null)
	  { output.close();  }
	}
	
  }
  
}