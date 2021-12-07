// Given an array of integers representing an elevation map 
// where the width of each bar is 1, return how much rainwater 
// can be trapped. 
/// Example ///
// Input: 
// Output: 

///// UMPIRE /////
/// Understand:
// Are all the numbers positive? Yes
// Are there duplicates in the array? No
// Will there always be a solution available? No
// Empty array? One element in array?
//// [] (empty array), [5] (one element)
// Do the left and right sides of the graph count as walls? No, the sides cannot be used to form a container.
// What do we return if there is no solution? Return 0

/// Match:
// Test Cases = 
// [0,1,0,2,1,0,3,1,0,1,2] returns 8
// [] returns 0
// [3] returns 0
// [3,4,3] returns 0

/// Plan:
// Solution 1 =  --> O(n^2)
// Formula: currentWater = min(maxRight, maxLeft) - currentHeight
// Solution 2 =  --> O(n)

/// Implement:
// Solution 1:
class WaterTrapped {
  public int waterTrappedSol1(int[] arr) {
     int totalWater = 0;
     int currentWater = 0;
     int maxRight;
     int maxLeft;

      for (int i = 0; i < arr.length; i++) {
        // Reset right and left
        maxRight = 0;
        maxLeft = 0;

        // Find the max number on the right side
        for (int j = i; j < arr.length; j++) {
          if (maxRight < arr[j])
            maxRight = arr[j];
        }
        
        // Find the max number on the left side
        for (int k = i; k >= 0; k--) {
          if (maxLeft < arr[k])
            maxLeft = arr[k];
        }
        
        // System.out.println("index: " + i + ", maxR: " + maxRight + ", maxL: " + maxLeft + ", element: " + arr[i] + ", currentTotal: " + currentWater);
        // Calculate current water using formula
        currentWater = Math.min(maxRight,maxLeft) - arr[i];

        // Only add current water to total if it is positive
        if (currentWater >= 0)
          totalWater += currentWater;

        //System.out.println("total: " + totalWater);
      }

     return totalWater;
  }

/// Review - Solution 1:
// *Check for mistakes
// *Walkthough code

/// Evaluate - Solution 1:
// *Check if input scales up
// Time Complexity = 
// Space Complexity =

/// Implement:
// Solution 2:
  public int waterTrappedSol2(int[] arr) {
     int result = 0;

     return result;
  }

/// Review - Solution 2:
// *Check for mistakes
// *Walkthough code

/// Evaluate - Solution 2:
// *Check if input scales up
// Time Complexity = 
// Space Complexity =
}