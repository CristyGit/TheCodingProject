import java.util.HashMap;
// Given an array of integers, return the indices of the 
// two numbers that add up to a given target.
/// Example ///
// Input: array = [1,2,3,4,5], target = 5 
// Output: twoSum = [1,2] /// INDECES of 2 and 3

///// UMPIRE /////
/// Understand:
// Are all the numbers positive? Yes
// Are there duplicates in the array? No
// Will there always be a solution available? No
// Empty array? One element in array?
//// Ex: [1,3,7,9,2] target = 25, [] (empty array), [5] (one element)
// What do we return if there is no solution? Return NULL
// Can there be multiple pairs that add up to the value? No, only one pair

/// Match:
// Test Cases = 
/// [] target=1 --> returns null 
/// [2] target=2 --> returns null 
/// [1,2,3,4] target=89 --> returns null 
/// [1,3,7,9,2] target=11 --> returns [3,4]
// [1,6] target=7 --> returns [0,1]

/// Plan:
// Solution 1 = Two pointers (i and j) pairing two elements --> O(n^2)
// Formulas: target == arr[i] + arr[j], arr[j] == target - arr[i]

// Solution 2 = Hashmap with formula --> O (n) to find number

/// Implement:
// Solution 1:
class TwoSum {
  public int[] TwoSumSol1(int[] arr, int target) {
    int[] result = {0,0};
    
    // Brute Force O(n^2)
    for (int i = 0; i < arr.length; i ++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] == target - arr[i]) {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
    }

    return result; 
  }

/// Review:
// Check for mistakes
// Walkthough code

/// Evaluate:
// input scales up
// Time Complexity = O(n^2) 
// Space Complexity = O(1)

/// Implement: 
// Solution 2:
  public int[] TwoSumSol2(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int[] result = {0,0};
    int ntf = 0;

    // Hashmap 
    for (int i = 0; i < arr.length; i++) {
      // Check if number is in HashMap
      // If it is, then you found the ntf 
      if (map.containsKey(arr[i])) {
        result[0] = map.get(arr[i]);
        result[1] = i;
        return result;
      }
      // if no, calculate the ntf and add it with index
      else {
        ntf = target - arr[i];
        map.put(ntf, i);
      }
    }
    return result; 
  }
}

/// Review:
// Check for mistakes
// Walkthough code

/// Evaluate:
// input scales up
// Time Complexity = O(n) 
// Space Complexity = O(n) 
