// You are given an array of positive integers
// where each integer represents the height of a 
// vertical line on a chart. Find two lines which
// together with the x-axis forms a container that 
// would hold the greatest amount of water. Return 
// the area of water it would hold.
/// Example ///
// Input: array = [1,8,6,2,9,4] 
// Output: area = 8*3 = 24

///// UMPIRE /////
/// Understand:
// Are all the numbers positive? Yes
// Does the thickness of the lines affcet the area? No, assume they take up no space.
// Do the left and right sides of the graph count as walls? No, the sides cannot be used to form a container.
// Does a higher line inside our container affect our area? No, lines inside a container don't affect the area.
// Will there always be a solution available? Yes
// Empty array? One element in array? return 0
 
/// Match:
// Test Cases = 
/// [7,1,2,3,9] --> returns 7*4 = 28
/// [] --> returns 0
/// [7] --> returns 0
/// [6,9,3,4,5,8] --> returns 8*4 = 32

/// Plan:
// Solution 1 = Two for loops with two pointers (i and j) --> O(n^2)
// Formula: Area=l*w ~> min(pointerA,pointerB) * (indexPointerB - indexPointerA)
// Solution 2 = 

class MostWaterCont {
  /// Implement:
  // Solution 1:
  public int findAreaInLargestContainerSol1(int[] arr) {
    int maxArea = 0;
    int height = 0;
    int area = 0;
    int width = 0;

    // Brute Force O(n^2)
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        height = Math.min(arr[i],arr[j]);
        width = j-i;
        area = height * width;
        // Formula
        if (maxArea < area) {
          maxArea = area;
        }
      }
    }

    return maxArea;
  }

  /// Review - Solution 1:
  // *Check for mistakes
  // *Walkthough code

  /// Evaluate - Solution 1:
  // *Check if Input scales up
  // Time Complexity = O(n^2) 
  // Space Complexity = O(n) 

  public int findAreaInLargestContainerSol2(int[] arr) {
    int area = 0;

    return area;
  }
}