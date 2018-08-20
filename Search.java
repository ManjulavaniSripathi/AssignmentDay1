package assignment1;

public class Search {
     public static void main(String[ ] args)
     {
           int [ ] numbers = { 5,12,14,6,78,19,1,23,26,35,36,7,52,86,47 };
           int key = 19;

           int i = 0;
           boolean found = false;    
          for ( i = 0; i < numbers.length; i++)
          {
                 if (numbers[ i ]  == key)
                {
                         found = true;      
                         break;
                 }
           }

          if (found)             {
                System.out.println("Found " + key + " at index " + i + ".");
          }
          else
          {
                System.out.println(key + "is not in this array.");
          }
      }
}