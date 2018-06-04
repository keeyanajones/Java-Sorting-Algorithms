/**
 * Java Radix Sort Example
 * shows radix sort.
 * 
 * A sort that sorts numbers by processing individual digits. n numbers 
 * consisting of k digits each are sorted in O(n · k) time. Radix sort can 
 * process digits of each number either starting from the least significant 
 * digit (LSD) or starting from the most significant digit (MSD).
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package noncomparison;

import java.util.*;

public class RadixSort {    
 // A utility function to get maximum value in intArray[]
 static int getMax(int intArray[], int n) {
  int max = intArray[0];
  for (int i = 1; i < n; i++)
    if (intArray[i] > max)
     max = intArray[i];
  return max;
 }
    
 public static void main(String[] args) {               
  // create an int array we want to sort using bucket sort 
  int intArray[] = new int[] 
             {8,4,1,56,3,44,23,6,28,8,4,1,5,423,44,3,6,28};
  // Driver function to check for above function
  int n = intArray.length;

  // print array before sorting using radix sort 
  System.out.println("Array Before Radix Sort");
  print(intArray, n); 

  // sort an array using radix sort 
  RadixSort ob = new RadixSort();
  ob.radixSort(intArray, n);

  System.out.println(" ");

  // print array after sorting using radix sort 
  System.out.println("Array After Radix Sort");
  print(intArray, n);         
 }    
    
 /** A function to do counting sort of intArray[] 
  *  according to the digit represented by exp.
  **/
 static void countSort(int intArray[], int n, int exp) {        
  // output array
  int output[] = new int[n]; 
  int count[] = new int[10];
  int i;
  Arrays.fill(count,0);

  // Store count of occurrences in count[]
  for (i = 0; i < n; i++)
    count[ (intArray[i] / exp) % 10 ]++;

  /** 
   * Change count[i] so that count[i] now 
   * contains actual position of  this 
   * digit in output[]
   **/ 
  for (i = 1; i < 10; i++)
    count[i] += count[i - 1]; 
  // Build the output array
  for (i = n - 1; i >= 0; i--) {
    output[count[(intArray[i] / exp) % 10 ] - 1] = intArray[i];
    count[(intArray[i] / exp)%10 ] --;
  }        
  /**
   * Copy the output array to intArray[], so that
   * intArray[] now contains sorted numbers 
   * according to current digit
   **/ 
    for (i = 0; i < n; i++)
        intArray[i] = output[i];
 }   

 // The main function to that sorts arr[] of 
 // size n using Radix Sort
 private void radixSort(int intArray [], int n) {                
  // Find the maximum number to know number 
  // of digits
  int m = getMax(intArray, n);

  /** 
   * Do counting sort for every digit. Note that 
   * instead of passing digit number, exp is 
   * passed. exp is 10^i where i is current digit
   * number
   **/ 
    for (int exp = 1; m / exp > 0; exp *= 10)
        countSort(intArray, n, exp);
    }

// A utility function to print an result array        
static void print(int intArray[], int n) {
  for (int i = 0; i < n; i++)
    System.out.print(intArray[i]+" ");
 }
} 
    