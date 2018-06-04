/**
 * Java Binary Tree Sort Example
 * shows binary tree sort.
 * 
 * A sort that builds a binary search tree from the elements to be sorted, 
 * and then traverses the tree (in-order) so that the elements come out in 
 * sorted order. Its typical use is sorting elements adaptively: after each 
 * insertion, the set of elements seen so far is available in sorted order.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package comparison;
  
public class BinaryTreeSort {
 // basic node stored in a tree
 class Node {
  public Object element;
  public Node leftChild;
  public Node rightChild;
  
  // constructor
  public Node(Object theElement) {
   this(theElement, null, null);
  }
  
  public Node(Object theElement, 
              Node lLink, 
              Node rLink) {
   element = theElement;
   this.leftChild = lLink;
   this.rightChild = rLink;
  }
 }        

 /**
  * has 1 constructor, which takes as 
  * parameter an object type root element 
  * will be the first element in the list
  * of elements to sort.
  **/
 public Node root;

 // constructor
 public BinaryTreeSort (Object x) { 
  root = new Node(x);
 }

 /**
  * add the new element in tree corresponding 
  * to the root, at each level it will check 
  * if the element to be added is smaller 
  * (move to left-subtree) or greater (move 
  * to right-subtree); and accordingly position 
  * decided.
  * @param node
  * @param x
  * @return 
  **/
 public Node insert(Node node, Integer x) {
  if (node == null) {
      return node = new Node(x);
  }
  if (x < (Integer) node.element) {
      node.leftChild = insert(node.leftChild, x);
  } else {
      node.rightChild = insert(node.rightChild, x);
  }
  return node;
 }

 /**
  * in-order traversal (left->root->right) of tree 
  * for getting elements in ascending order
  * @param node
  **/
 public void inOrder(Node node) {
  if (node != null) {
    inOrder(node.leftChild);
    System.out.print(((Integer) node.element)+ " ");
    inOrder(node.rightChild);
  }
 }

/** 
 * right->root->left traversal of tree for getting 
 * elements in descending order
 * @param node
 **/ 
 public void descendingOrder(Node node) {
 if (node != null) {
    descendingOrder(node.rightChild);
    System.out.print(((Integer) node.element)+ " ");
    descendingOrder(node.leftChild);
  }
 }

 public static void main(String[] args) {         
  // create an int array we want to 
  // sort using tree sort 
  int[] intArray = {24,2,45,20,56,75,2,56,99,53,12};
  BinaryTreeSort tree = new BinaryTreeSort(intArray[0]);
  for (int i = 1; i < intArray.length; i++) {
    tree.insert(tree.root,  intArray[i]);
  }

 // print array before sorting using tree sort 
 System.out.println("Array Before Tree Sort");
 for (int i = 0; i < intArray.length; i++) {
  System.out.print(intArray[i] + " ");
 }                     
 System.out.println(" ");

 // print array after sorting using tree sort
 System.out.print("After Tree Sort in Increasing Order: ");
 System.out.println(" ");
 tree.inOrder(tree.root);
 System.out.println(" ");
 System.out.print("After Tree Sort in Decreasing Order: ");
 System.out.println(" ");
 tree.descendingOrder(tree.root);            
 System.out.println(" ");
 }
}    
    