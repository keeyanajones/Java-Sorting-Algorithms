/**
 * Java Merge Sort Example
 * shows merge sort.
 * 
 * Merge sort takes advantage of the ease of merging already sorted lists 
 * into a new sorted list. It starts by comparing every two elements 
 * (i.e., 1 with 2, then 3 with 4...) and swapping them if the first 
 * should come after the second. It then merges each of the resulting lists 
 * of two into lists of four, then merges those lists of four, and so on; 
 * until at last two lists are merged into the final sorted list.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package common;

public class MergeSort {   
 private int[] array;
 private int[] tempMergArr;
 private int length; 

 public static void main(String[] args) {
  // create an int array we want to sort 
  // using merge sort algorithm
  int intArray[] = new 
      int[] {45,23,11,89,77,98,4,28,65,43};

  // print array before sorting 
  // using merge sort algorithm
  System.out.println("Array Before Merge Sort");
  for(int i:intArray){
   System.out.print(i + " ");
  }           
  MergeSort ms = new MergeSort();
  ms.sort(intArray);
 }

 public void sort(int intArray[]) {
  this.array = intArray;
  this.length = intArray.length;
  this.tempMergArr = new int[length];
  // sort an array using merge sort algorithm
  mergeSort(0, length - 1);
  // print array after sorting 
  // using merge sort algorithm
  System.out.println(" ");
  System.out.println("Array After Merge Sort");
  for (int i = 0; i < intArray.length; i++) {
   System.out.print(intArray[i] + " ");
  } 
 }

 private void mergeSort(int lowerIndex, 
                        int higherIndex) {         
  if (lowerIndex < higherIndex) {
   int middle = lowerIndex + 
                (higherIndex - lowerIndex) / 2;
   // Below step sorts the left side of the array
   mergeSort(lowerIndex, middle);
   // Below step sorts the right side of the array
   mergeSort(middle + 1, higherIndex);
   // Now merge both sides
   mergeParts(lowerIndex, middle, higherIndex);
  }
 }

 private void mergeParts(int lowerIndex, 
                         int middle, 
                         int higherIndex) { 
  for (int i = lowerIndex; i <= higherIndex; i++) {
    tempMergArr[i] = array[i];
  }

  int i = lowerIndex;
  int j = middle + 1;
  int k = lowerIndex;

  while (i <= middle && j <= higherIndex) {
   if (tempMergArr[i] <= tempMergArr[j]) {
       array[k] = tempMergArr[i];
       i++;
   } else {
       array[k] = tempMergArr[j];
       j++;
   }
    k++;
  }

  while (i <= middle) {
   array[k] = tempMergArr[i];
   k++;
   i++;
  } 
 }
}
  