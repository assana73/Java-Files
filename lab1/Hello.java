import java.util.Scanner;

public class Hello
{
   public static void main(String [] args)
   {
      /* This creates a new Scanner to read from the standard
         input (the keyboard).  You should examine the Scanner
         class in the Java API documentation linked from the
         course website.
      */
      Scanner scan = new Scanner(System.in);

      /* This will print to the standard output (the console). */
      System.out.print("Enter your name: ");

      /* String is a type. */
      String name = scan.next();

      /* The '+' operator on String values creates a new
         String by concatenating the operands.
      */
      System.out.println("Hello, " + name + ".");
   }
}
