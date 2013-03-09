public class SimpleArray
{
   public static int [] squareAll(int values[])
   {
      int size= values.length;
      int [] newValues= new int[size];

      /* TO DO: The output array, newValues, should hold as
         its elements the square of the corresponding element
         in the input array.

         Write a loop to copy the square of each element from the
         input array into the output array.
      */
      for(int i=0; i<size;i++)
      { newValues[i]=values[i] * values[i];  }

      return newValues;
   }
}
