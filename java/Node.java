/**
* @author Joshua Levi Flores Rankin
* @version 12/4/2019 @ 18:00
*/

/**
* Node class for the Huffman Coding Assignment
* Implements Comparable interface for other <Node>s
*/
public class Node implements Comparable<Node>{
   private Node left;
   private Node right;
   private char character;
   private int frequency;
   
   /**
   * This is the base constructor that inputs a character and a frequency
   * @param char character input character data
   * @param int frequency input frequency data
   */
   public Node(char character, int frequency){
      this.character = character;
      this.frequency = frequency;
      this.left = null;
      this.right = null;
   }
   
   /**
   * This is one of the constructors that inputs a character, frequency, left node, and right node
   * @param char character input character data
   * @param int frequency input frequency data
   * @param Node left input left node
   * @param Node right input right node
   */
   public Node(char character, int frequency, Node left, Node right){
      this.character = character;
      this.frequency = frequency;
      this.left = left;
      this.right = right;
   }
   
   /**
   * This is the toString method, which returns the character and frequency datas of the current node
   * @return String temp "Character: char Frequency: int"
   */
   public String toString(){
      String temp = "Character: " + character + " Frequency: " + frequency;
      return temp;
   }
   
   /**
   * This is the compareTo method, which allows this node to be compared to others by its frequency
   * @param Node otherNode this is the other node that the current one is being compared to
   */
   public int compareTo(Node otherNode){
      return (this.frequency - otherNode.getFrequency());
   }
   
   public void setCharacter(char character){
      this.character = character;
   }
   
   public void setFrequency(int frequency){
      this.frequency = frequency;
   }
   
   public void setLeft(Node left){
      this.left = left;
   }
   
   public void setRight(Node right){
      this.right = right;
   }
   
   public char getCharacter(){
      return character;
   }
   
   public int getFrequency(){
      return frequency;
   }
   
   public Node getLeft(){
      return left;
   }
   
   public Node getRight(){
      return right;
   }
   
   /**
   * This isLeaf() method checked if both the left and the right nodes are null and if they are, the current node is a leaf
   * @return boolean returns true or false
   */
   public boolean isLeaf(){
      if (left == null && right == null){
         return true;
      } return false;
   }
}
