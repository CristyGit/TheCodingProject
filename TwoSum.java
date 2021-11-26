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
// Two pointers (i and j) pairing two elements --> O(n^2)
// Formulas: target == arr[i] + arr[j], arr[j] == target - arr[i]

/// Implement:
class TwoSum {
    public int[] TwoSumProb(int[] arr, int target) {
        int[] result = {0,0};
        
        // Brute Force O(n^2)
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
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
// Time Complexity = O(n^2) 
// 