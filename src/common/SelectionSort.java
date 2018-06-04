/**
 * Java Selection Sort Example
 * shows selection sort.
 * 
 * An in-place comparison sort. It has O(n2) complexity, making it inefficient 
 * on large lists, and generally performs worse than the similar insertion 
 * sort. Selection sort is noted for its simplicity, and also has performance 
 * advantages over more complicated algorithms in certain situations.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package common;

public class SelectionSort {
 public static void main(String[] args) {
  // create an int array we want to 
  // sort using selection sort 
  int intArray[] = new int[] {9,14,3,2,43,11,58,22};

  // print array before sorting 
  // using selection sort 
  System.out.println("Array Before Selection Sort");
  for (int i = 0; i < intArray.length; i++) {
    System.out.print(intArray[i] + " ");
 }

 // sort an array using selection sort
 selectionSort(intArray);

 System.out.println("");

 // print array after sorting using selection sort
 System.out.println("Array After Selection Sort");
 for (int i = 0; i < intArray.length; i++) {
   System.out.print(intArray[i] + " ");
  } 
 }

 private static void selectionSort(int[] intArray) {
  int n = intArray.length;

  for (int i = 0; i < n - 1; i++) {
   int index = i;
   for (int j = i + 1; j < n; j++) {
     if (intArray[j] < intArray[index]) {
        index = j;
        int smallerNumber = intArray[index]; 
        intArray[index] = intArray[i];
        intArray[i] = smallerNumber;
    }
   }
  }
 }
}
