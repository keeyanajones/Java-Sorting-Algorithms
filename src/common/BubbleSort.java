/**
 * Java Bubble Sort Example
 * shows bubble sort.
 * 
 * A simple sorting algorithm that repeatedly steps through the list to be 
 * sorted, compares each pair of adjacent items and swaps them if they are 
 * in the wrong order. The pass through the list is repeated until no swaps 
 * are needed, which indicates that the list is sorted. The algorithm, which 
 * is a comparison sort, is named for the way smaller or larger elements 
 * "bubble" to the top of the list.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package common;

public class BubbleSort { 
 public static void main(String[] args) {
  // create an int array we want to 
  // sort using bubble sort
  int intArray[] = new int[] {5,90,35,45,150,3};

  // print array before sorting using bubble sort 
  System.out.println("Array Before Bubble Sort");
  for (int i = 0; i < intArray.length; i++) {
    System.out.print(intArray[i] + " ");
  }
  // sort an array using bubble sort algorithm
  bubbleSort(intArray);

  System.out.println("");

  // print array after sorting using bubble sort 
  System.out.println("Array After Bubble Sort");
  for (int i = 0; i < intArray.length; i++) {
    System.out.print(intArray[i] + " ");
  } 
 }

 private static void bubbleSort(int[] intArray) {
  int n = intArray.length;
  int temp = 0;

  for (int i = 0; i < n; i++) {
   for (int j = 1; j < (n - i); j++) {
    if (intArray[j - 1] > intArray[j]) {
        //swap the elements!
        temp = intArray[j - 1];
        intArray[j - 1] = intArray[j];
        intArray[j] = temp;
    }
   }
  }
 }
}
   