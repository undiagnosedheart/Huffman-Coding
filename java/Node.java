public class Node implements Comparable<Node>{
   private Node left;
   private Node right;
   private char character;
   private int frequency;
   
   public Node(char character, int frequency){
      this.character = character;
      this.frequency = frequency;
      this.left = null;
      this.right = null;
   }
   
   public Node(char character, Node left, Node right){
      this.character = character;
      this.frequency = frequency;
      this.left = left;
      this.right = right;
   }
   
   public String toString(){
      String temp = "Character: " + character + " Frequency: " + frequency;
      return temp;
   }
   
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
   
   public boolean isLeaf(){
      if (left == null && right == null){
         return true;
      } return false;
   }
}
