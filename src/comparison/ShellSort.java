/**
 * Java Shell Sort Example
 * shows shell sort.
 * 
 * An in-place comparison sort. It can be seen as either a generalization of 
 * sorting by exchange (bubble sort) or sorting by insertion (insertion sort). 
 * The method starts by sorting pairs of elements far apart from each other, 
 * then progressively reducing the gap between elements to be compared. 
 * Starting with far apart elements, it can move some out-of-place elements 
 * into position faster than a simple nearest neighbor exchange. Donald 
 * Shell published the first version of this sort in 1959. The running time 
 * of Shellsort is heavily dependent on the gap sequence it uses. For 
 * many practical variants, determining their time complexity remains an 
 * open problem.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package comparison;

import java.util.*;

public class ShellSort { 
 public static void main(String[] args) {
    // create an int array we want to 
    // sort using shell sort
    int intArray[] = new int[] 
        {61,109,149,111,34,2,24,119,122,125,27,145};
    
    // print array before sorting using shell sort 
    System.out.println("Before Shell Sort");
    System.out.println(Arrays.toString(intArray)); 

    // sort an array using shell sort 
    ShellSort ob = new ShellSort();
    ob.shellSort(intArray);

    // print array after sorting using shell sort 
    System.out.println("After Shell Sort");
    System.out.println(Arrays.toString(intArray)); 
 }

 private static void shellSort(int A []) { 
  int n = A.length;
/** 
 * Start with a larger gap, then reduce the 
 * gap to 1 take gap sequence in order of 
 * |N/2|, |N/4|, |N/8|...1
 **/
  for (int gap = n / 2; gap > 0; gap /= 2) {
    /** 
     * Perform gapped insertion sort for this 
     * gap size.The first gap elements
     * a[0..gap-1] are already in gapped order
     *  keep adding one more element until the 
     * entire array is gap sorted
     **/
    for (int i = gap; i < n; i += 1) { 
        // store a[i] in temp and make a hole 
        // at position i 
        int temp = A[i]; 
        /**
         * shift earlier gap-sorted elements up 
         * until the correct location for a[i] 
         * is found 
         **/ 
        int j; 
        for (j = i; j >= gap && A[j - gap] > temp;
             j -= gap)
            A[j] = A[j - gap];
        // put temp (the original a[i]) in its 
        // correct location
        A[j] = temp;
   }
  }
 }
}
    