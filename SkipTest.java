package skip;

public class SkipTest {
 public static void main(String[] args) {

// Initialize an empty Skiplist
  SkipList<String> S = new SkipList<String>();

// Print the entire skip list going horizontally  
  S.printHorizontal();
  
// Returns True/False if it's empty or not 
  System.out.println("\n\nIs it empty: " + S.isEmpty());
  
  System.out.println("S.size() is: " + S.size());
      
// Insert ABC
  System.out.println("S.insert(\"ABC\", \"213\") inserts \"ABC\" as the key and \"213\" as the object.");      
  S.insert("ABC", "213");
  S.insert("BCD", "1");
  S.insert("CDE", "1");
  S.printHorizontal();
  
// Print just the bottom row
//  S.getOneRow("S");  
  
// Returns the key at a node with key ABC
  System.out.println("\n\nS.getValueOfNode(\"ABC\") returns the key at that node so it's...." + S.getValueOfNode("ABC"));
  
// What if there's no key at XYZ?  
  System.out.println("\n\nIf there's no node with key XYZ, S.getValueOfNode(\"XYZ\") returns..." + S.getValueOfNode("XYZ"));
  
// Search returns the key if it exists
  System.out.println("Searching for ABC gives..." + S.search("ABC"));
  
// otherwise Search returns the key of the element closest in value to the key searched for
  System.out.println("Searching for XYZ gives..." + S.search("XYZ"));    

// Returns size of the skiplist  
  System.out.println("\n\nSize: " + S.size());
  
// Returns True/False if it's empty or not  
  System.out.println("S.isEmpty() Is it empty: " + S.isEmpty() + "\n\n");
  
// Remove a node
  S.delete("ABC");
  S.printHorizontal();
  
// Returns size 
  System.out.println("\n\n");
  System.out.println("S.size() What is the size: " + S.size());  
  
// Returns minimum
// input: none
// output: key
  System.out.println("The minimum node is " + S.minimum());

// Returns maximum  
// input: none
// output: key
  System.out.println("The maximum node is " + S.maximum());  
  
  S.insert("ABC", "0");
  S.insert("DOG", "3");
  S.insert("cat", "5");
  
  S.printHorizontal();
  
// Returns the predecessor of the given key
// input: key
// output: the predecessor of that key
  System.out.println("S.predecessor(\"DOG\")     Predecessor of DOG: " + S.predecessor("DOG"));

// Returns the successor of the given key  
// input: key
// output: the successor of that key
  System.out.println("S.successor(\"ABC\")       Successor of ABC: " + S.successor("ABC"));
  
// What is the predecessor of the first key  
  System.out.println("S.predecessor(\"ABC\")  is: " + S.predecessor("ABC"));
  
// What is the successor of the last key
  System.out.println("S.successor(\"DOG\")   is: " + S.successor("ABC"));  
  
  
//  System.out.println(((SkipListEntry<String>) S.search("ABC")).getValue());
  
 }
}
