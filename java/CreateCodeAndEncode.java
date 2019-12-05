import java.io.*;
import java.util.*;
import java.lang.*;

public class CreateCodeAndEncode{
   public static void main(String[] args) throws Exception{
      Scanner input = new Scanner(System.in);
      String inputFile = "";
      boolean keepGoing = true;
      
      //Step 1: Ask user for text file
      while(keepGoing){
         System.out.print("ASK USER FOR TEXT FILE: ");
         inputFile = input.nextLine();
         if (inputFile.endsWith(".txt")){
            keepGoing = false;
         }
      }
      
      //Step 2: Open the file and read it character by character
      //Take each character and add it to the list
      FileInputStream x = new FileInputStream(inputFile);
      List<Character> chars = new ArrayList<>();
      while (x.available() > 0){
         char c = (char) x.read();
         chars.add(c);
      } //You will have to do some work w/ try & catch
      
      //Make a map of each character and its frequency
      
      //Create a Java PriorityQueue<Node>
      
      //For each character on the map, make a node with the character and frequency and add that node
         //to a priority queue
   }

   /*
   Step 3: Using your list, make a map of each character and its frequency.
   
   Step 4: Create a Java PriorityQueue<Node>.
   
   Step 5: For each character in the map, create a node with the character and the frequency
           and add that node to a priority queue.
   
   Step 6: While the PriorityQueue has a size greater than one:
   
      ...
   */
}
