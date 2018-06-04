/**
 * Java Quick Sort Example
 * shows quick sort.
 * 
 * A divide and conquer algorithm which relies on a partition operation: to 
 * partition an array an element called a pivot is selected. All elements 
 * smaller than the pivot are moved before it and all greater elements are 
 * moved after it. This can be done efficiently in linear time and in-place. 
 * The lesser and greater sublists are then recursively sorted. This yields 
 * average time complexity of O(n log n), with low overhead, and thus this 
 * is a popular algorithm.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package common;

public class QuickSort {        
 private int array[];
 private int length;

 public void sort(int[] inputArray) {
  if (inputArray == null || inputArray.length == 0) {
    return;
  }        
  this.array = inputArray;
  length = inputArray.length;
  quickSort(0, length - 1);
 }

 private void quickSort(int lowerIndex, 
                        int higherIndex) {
  int i = lowerIndex;
  int j = higherIndex;

  // calculate pivot number, taking pivot
  // as middle index number
  int pivot = array[lowerIndex + 
             (higherIndex - lowerIndex) / 2];
  // Divide into two arrays
  while (i <= j) {
    /**
     * In each iteration, we will identify a number 
     * from left side which is greater then the pivot 
     * value, and also we will identify a number from 
     * right side which is less then the pivot value. 
     * Once the search is done, then we exchange both 
     * numbers.
     **/
    while (array[i] < pivot) {
        i++;
    }
    while (array[j] > pivot) {
        j--;
    }
    if (i <= j) {
        swap(i, j);
        //move index to next position on both sides
        i++;
        j--;
    }
  }
  // call quickSort() method recursively
  if (lowerIndex < j)
    quickSort(lowerIndex, j);
  if (i < higherIndex)
    quickSort(i, higherIndex);
 }         

 private void swap(int i, int j) {
  int temp = array[i];
  array[i] = array[j];
  array[j] = temp;
 }

 public static void main(String[] args) {
  QuickSort sorter = new QuickSort();
  // create an int array we want to 
  // sort using quick sort
  int[] intArray = {24,2,45,20,56,75,2,56,99,53,12};

  // print array before sorting using quick sort 
  System.out.println("Array Before Quick Sort");
  for (int i = 0; i < intArray.length; i++) {
   System.out.print(intArray[i] + " ");
  }                     
  sorter.sort(intArray);
  System.out.println(" ");

  // print array after sorting using quick sort
  System.out.println("Array After Quick Sort");
  for(int i:intArray){
   System.out.print(i);
   System.out.print(" ");
  }
 }
}      
    