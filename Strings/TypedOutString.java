import java.util.*;
// Given two strings S and T, return if they equal 
// when both are typed out. Any '#' that appears 
// in the string counts as a backspace


///// UMPIRE /////
/// Understand:
// What if empty inputs? "x#y#z#" and "a#" --> "" and "" which returns true
// Two #'s? example: ab## -> ""
// What if there is no character to remove? then nothing is deleted. example: a###b -> "b"
// Case sensitivity? Yes, it does "a" is not equal "A"

/// Match:
// [ab#z] and [az#z] returns true
// [] and [] returns true
// [c#cf] and [cf] returns true
// [ab##] and [ac#] returns false
// [AB#] and [a] returns false

/// Plan:
// Solution 1 = Stack/Array solution. Go throught string one char at a time and add them to a stack except for #. if you see a #, pop (remove last char) the stack if it is not empty.
// Solution 2 & 3 = Improve space complexity by using two pointers.


/// Implement:
// Solution 1:
class TypedOutString {
  public boolean typingStringsSol1(String str1, String str2) {
    String strFinal1 = typeStrings(str1);
    String strFinal2 = typeStrings(str2);

    System.out.println(strFinal1);
    System.out.println(strFinal2);
  
    if (strFinal1.length() != strFinal2.length())
      return false;
    else if (strFinal1.equals(strFinal2)) {
      return true;
    }

    return false;
  }

  // Helper function
  public String typeStrings(String str) {
    Stack stack = new Stack();

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != '#')
          stack.push(str.charAt(i));
        else if (str.charAt(i) == '#' && !stack.isEmpty())
          stack.pop();
    }

    return stack.toString();
  }

/// Review - Solution 1:
// *Check for mistakes
// *Walkthough code

/// Evaluate - Solution 1:
// *Check if input scales up
// Time Complexity = O(a + b) a and b are the srings lengths
// Space Complexity = O(a + b)

/// Implement: FIX!!! doesn't account for multiple ###
// Original Solution 2:
  public boolean typingStringsSol2(String str1, String str2) {
    int p1 = str1.length()-1;
    int p2 = str2.length()-1;

    while(str1.contains("#") || str2.contains("#"))
    {
      if (str1.charAt(p1) == '#' && !str1.isEmpty()) {
        str1 = str1.replace(str1.charAt(p1-1)+"#", "");
      }

      if (str2.charAt(p2) == '#' && !str2.isEmpty()) {
        str2 = str2.replace(str2.charAt(p2-1)+"#", "");
      }

      //System.out.println(str1 + " " + str2);

      if (str1.contains("#"))
        p1--;
      if (str2.contains("#"))
        p2--;
    }

    // System.out.println(str1);
    // System.out.println(str2);
    System.out.println("FIX!!!");

    return str1.equals(str2);
  }

  /// Review - Solution 2:
  // *Check for mistakes
  // *Walkthough code

  /// Evaluate - Solution 2:
  // *Check if Input scales up
  // Time Complexity = O(a + b) 
  // Space Complexity = O(n) 

/// Implement: 
// Solution 3:
  public boolean typingStringsSol3(String str1, String str2) {
    // String str1 = "abc#d";
    // String str2 = "abzz##d";
    int p1 = str1.length()-1;
    int p2 = str2.length()-1;

    while(p1 >= 0 || p2 >= 0)
    {
      if (str1.charAt(p1) == '#' || str2.charAt(p2) == '#') {
        if (str1.charAt(p1) == '#') { // p1 = 3
          int backcount = 2; 
          while (backcount > 0) { // backcount = 2, 1
            p1--; // p1 = 2, 1
            backcount--; // backcount = 1, 0
            if (str1.charAt(p1) == '#') // p1 = 2 'c'
              backcount = backcount + 2;
          }
        }
        if (str2.charAt(p2) == '#') { // p2 = 5
          int backcount = 2; 
          while (backcount > 0) { // backcount = 2, 3, 2, 1
            p2--; // p2 = 4, 3, 2, 1
            backcount--; // backcount = 1, 2, 1, 0
            if (str1.charAt(p2) == '#') // p2 = 4 '#', p2 = 3 'z', p2 = 2 'z', p2 = 1 'b'
              backcount = backcount + 2; // backcount = 3
          }
        }
      } 
      else {
        if (str1.charAt(p1) != str2.charAt(p2))
          return false;
        else
          p1--;
          p2--;
      }
    }

    return true;
  }

  /// Review - Solution 3:
  // *Check for mistakes
  // *Walkthough code

  /// Evaluate - Solution 3:
  // *Check if Input scales up
  // Time Complexity = O(a + b) 
  // Space Complexity = O(1) 
}