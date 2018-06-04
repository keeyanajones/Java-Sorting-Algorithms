/**
 * Java Insertion Sort Example
 * shows insertion sort.
 * 
 * A simple sorting algorithm that is relatively efficient for small lists 
 * and mostly sorted lists, and is often used as part of more sophisticated 
 * algorithms. It works by taking elements from the list one by one and 
 * inserting them in their correct position into a new sorted list. In 
 * arrays, the new list and the remaining elements can share the array's 
 * space, but insertion is expensive, requiring shifting all following 
 * elements over by one.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package common;
            
public class InsertionSort { 
 public static void main(String[] args) {                 
  // create an int array we want to sort 
  // using insertion sort
  int intArray[] = new int[] {10,34,2,56,7,67,88,42};

  // print array before sorting using insertion sort
  System.out.println("Array Before Insertion Sort");
  for (int i = 0; i < intArray.length; i++) {
    System.out.print(intArray[i] + " ");
  }               

  // sort an array using insertion sort
  insertionSort(intArray);

  System.out.println("");

  // print array after sorting using insertion sort
  System.out.println("Array After Insertion Sort");
  for (int i = 0; i < intArray.length; i++) {
    System.out.print(intArray[i] + " ");
  } 
 }

 private static void insertionSort(int[] intArray) {
  int n = intArray.length;
  int temp = 0;

  for (int i = 1; i < n; i++) {
   for (int j = i; j > 0; j--) {                
    if (intArray[j] < intArray[j - 1]) {
     //swap the elements!
     temp = intArray[j];
     intArray[j] = intArray[j - 1];
     intArray[j - 1] = temp;
    }
   }
  }
 }
}    
    