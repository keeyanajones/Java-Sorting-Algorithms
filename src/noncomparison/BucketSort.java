/**
 * Java Bucket Sort Example
 * shows bucket sort.
 * 
 * A sort that works by distributing the elements of an array into a number 
 * of buckets. Each bucket is then sorted individually, either using a 
 * different sort, or by recursively applying the bucket sort. It can be 
 * implemented with comparisons and therefore can also be considered a 
 * comparison sort. The complexity estimates involve the number of buckets.
 ^
 * Bucket Sort Integer Keys
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package noncomparison;

import java.util.*;

public class BucketSort {    
    
 public static void main(String[] args) {               
  // create an int array we want to sort using bucket sort 
  int intArray[] = new int[] 
                {8,4,1,56,3,44,23,6,28,8,4,1,5,3,44,3,6,28};
  // set max value
  int maxValue = 56;      

  // print array before sorting using bucket sort 
  System.out.println("Array Before Bucket Sort");
  System.out.println(Arrays.toString(intArray)); 

  // sort an array using bucket sort algorithm
  BucketSort ob = new BucketSort();
  ob.bucketSort(intArray, maxValue);

  System.out.println("");

  // print array after sorting using bucket sort 
  System.out.println("Array After Bucket Sort");
  System.out.println(Arrays.toString(intArray));         
 }    

 private void bucketSort(int intArray [], int maxValue) {                
  int n = intArray.length; 

  // create the bucket int array 
  int bucket[] = new int[maxValue + 1];

  // Go over the original array, putting each 
  // object in its bucket.
  for (int i = 0; i < bucket.length; i++) {
    bucket[i] = 0;
  } 
  // sort non-empty buckets
  for (int i = 0; i < n; i++) {
    bucket[intArray[i]]++;
  }
  // visit buckets in order and put all elements 
  // back into original array. 
  int outPos = 0;
  for (int i = 0; i < bucket.length; i++) {
   for (int j = 0; j < bucket[i]; j++) {
    intArray[outPos++] = i;
   }
  }
 }        
}   
   