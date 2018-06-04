/**
 * Java Counting Sort Example
 * shows counting sort.
 * 
 * Applicable when each input is known to belong to a particular set, S, of 
 * possibilities. The algorithm runs in O(|S| + n) time and O(|S|) memory 
 * where n is the length of the input. It works by creating an integer 
 * array of size |S| and using the ith bin to count the occurrences of 
 * the ith member of S in the input. Each input is then counted by 
 * incrementing the value of its corresponding bin. Afterward, the 
 * counting array is looped through to arrange all of the inputs in order.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package common;

import java.util.*;

public class CountingSort {
 public static void main(String[] args) { 
  // create an int array we want to 
  // sort using counting sort 
  int intArray[] = new int[] 
                   {8,4,1,56,3,44,23,6,28,0};

  // print array before sorting 
  // using counting sort 
  System.out.println("Array Before Counting Sort");
  System.out.println(Arrays.toString(intArray)); 

  // sort an array using counting sort 
  CountingSort ob = new CountingSort();
  ob.countingSort(intArray);

  System.out.println("");

  // print array after sorting using counting sort 
  System.out.println("Array After Counting Sort");
  System.out.println(Arrays.toString(intArray));
 }    

 private void countingSort(int intArray []) {
  int n = intArray.length; 

  // The output ints array that will 
  // have sorted intArray
  int output[] = new int[n];
  /**
   * Create a count array to store count of 
   * individual ints and  initialize count 
   * array as 0
   **/
  int count[] = new int[256];
  for (int i = 0; i < 256; ++i)
      count[i] = 0; 
  // store count of each int
  for (int i = 0; i < n; ++i)
      ++count[intArray[i]];
  /**
   * Change count[i] so that count[i] now 
   * contains actual position of 
   * this ints in output array
   **/ 
  for (int i = 1; i <= 255; ++i)
      count[i] += count[i - 1]; 
  // Build the output character array
  for (int i = 0; i < n; ++i) {
      output[count[intArray[i]] - 1] = intArray[i];
      --count[intArray[i]];
  } 
  // Copy the output array to intArray, 
  // so that it contains sorted list
  for (int i = 0; i < n; ++i)
      intArray[i] = output[i];
 }
}      
    