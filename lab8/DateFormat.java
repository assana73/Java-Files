import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateFormat
{ public static void main(String [] args) throws IOException
    { BufferedReader input=null;
	  PrintWriter output=null;
	  try
	  { input=new BufferedReader(new FileReader("input2.txt"));
	    output=new PrintWriter(new FileWriter("output2.txt"));
		
		String l,s;
		while((s=input.readLine())!=null)
		{ String [] result=l.split("//s");
		
		  SimpleDateFormat got=new SimpleDateFormat("yyyy-MM-dd");
		  SimpleDateFormat end=new SimpleDateFormat("MM/dd/yyyy");
		  for(int i=0;i<result.length;i++)
		  { String dateS=result[i];
		    Date parsed;
		    try
			{ parsed=format.parse(dateS);
		  
			  output.println(end.format(parsed));
			}
			catch(ParseException pe)
			{ System.out.println("EXCEPTION!!");  }
		
		  }
		}
	  }
	
	finally
	{ if(input!=null)
	  { input.close();  }
	  if(output!=null)
	  { output.close();  }
	}
	
  }
}