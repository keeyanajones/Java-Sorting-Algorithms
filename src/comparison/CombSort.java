/**
 * Java Comb Sort Example
 * shows comb sort.
 * 
 * A relatively simple improvement on bubble sort. The basic idea is to 
 * eliminate turtles, or small values near the end of the list, since in a 
 * bubble sort these slow the sorting down tremendously. (Rabbits, large 
 * values around the beginning of the list, do not pose a problem in 
 * bubble sort).
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package comparison;

public class CombSort {
 // To find gap between elements
 int getNextGap(int gap) {
   gap = (gap * 10) / 13;
   // Shrink gap by Shrink factor
   if (gap < 1)
       return 1;
   return gap;
 }

 public static void main(String[] args) {               
  // create an int array we want to 
  // sort using comb sort 
  int A[] = new int[] {8,4,1,56,3,-44,23,-6,28,0};

  // print array before sorting using comb sort 
  System.out.println("Array Before Comb Sort");
  for (int i = 0; i< A.length; ++i)
    System.out.print(A[i] + " ");

  // sort an array using comb sort 
  CombSort ob = new CombSort();
  ob.combSort(A);

  System.out.println("");

  // print array after sorting using comb sort 
  System.out.println("Array After Comb Sort");
  for (int i = 0; i< A.length; ++i)
    System.out.print(A[i] + " ");
 }

 private void combSort(int A []) {                
  int n = A.length;
  // initialize gap
  int gap = n; 
  // Initialize swapped as true to make sure 
  // that loop runs
  boolean swapped = true; 
  /**
   * Keep running while gap is more than 1 and 
   * last iteration caused a swap
   **/ 
  while (gap != 1 || swapped == true)  {
    // Find next gap
    gap = getNextGap(gap); 
    /** 
     * Initialize swapped as false so that we 
     * can check if swap happened or not
     **/ 
    swapped = false; 
    // Compare all elements with current gap
    for (int i = 0; i < n - gap; i++) {
        if (A[i] > A[i + gap]) {                    
            // Swap A[i] and A[i+gap]
            int temp = A[i];
            A[i] = A[i + gap];
            A[i + gap] = temp; 
            // Set swapped
            swapped = true;
    }
   }
  }
 }
}
    