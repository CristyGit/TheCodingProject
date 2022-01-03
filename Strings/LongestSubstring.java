import java.util.*;
// Given a string, find the length of the longest 
// substring without repeating characters. Example:
// Input = abccabb, Output = 3

///// UMPIRE /////
/// Understand:
// Is the substring contiguous? Yes look for a substring and not a subsequent
// substring [abc]bbd VS subsequent [abc]bb[d]
// Does case sensitive matter?  No
// Can the substring overlap? Yes

/// Match:
// "abccabb" returns 3 [abc and cab]
// "cccccc" returns 1 [c]
// "" returns 0
// "abcbda" returns 4 [cbda]

/// Plan:
// Solution 1 = two pointers. first loop clears array, then second lop checks if element is not in the array. if it is not then add it and replace longest if necessary.
// Solution 2 = sliding window. 

/// Implement:
// Solution 1:
class LongestSubstring {

  public static int longestSubstringSol1(String str) {
    /// Test Cases =
    // "abccabb" returns 3 [abc and cab]
    // "cccccc" returns 1 [c]
    // "" returns 0
    // "abcbda" returns 4 [cbda]

    int longest = 0;
    ArrayList<Character> arr;

    if (str.length() <= 1)
      return str.length();

    for (int i = 0; i < str.length(); i++) {
      arr = new ArrayList<Character>();
      for (int j = i; j < str.length(); j++) {
        if (!arr.contains(str.charAt(j))) {
          arr.add(str.charAt(j));
          longest = Math.max(arr.size(), longest);
        } else {
          break;
        }
      }
    }

    return longest;
  }

  /// Review - Solution 1:
  // *Check for mistakes
  // *Walkthough code

  /// Evaluate - Solution 1:
  // *Check if input scales up
  // Time Complexity = O(n^2)
  // Space Complexity = O(n)

  public static int longestSubstringSol2(String str) {
    /// Test Cases =
    // "abccabb" returns 3 [abc and cab]
    // "cccccc" returns 1 [c]
    // "" returns 0
    // "abcbda" returns 4 [cbda]
    int longest = 0;
    int left = 0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    if (str.length() <= 1)
      return str.length();

    for (int right = 0; right < str.length(); right++) {
      char currentChar = str.charAt(right);
      if (map.containsKey(currentChar)) {
        int prevChar = map.get(currentChar);
        if (prevChar >= left) {
          left = prevChar + 1;
        }
      }
      map.put(currentChar, right);
      longest = Math.max(longest, right - left + 1);
    }
    return longest;
  }

  /// Review - Solution 2:
  // *Check for mistakes
  // *Walkthough code

  /// Evaluate - Solution 2:
  // *Check if input scales up
  // Time Complexity = O(n)
  // Space Complexity = O(n)
}