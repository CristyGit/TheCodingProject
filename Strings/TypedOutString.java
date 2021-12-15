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
// Solution 2 =


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
// Time Complexity = O(n) 
// Space Complexity = O(n)

/// Implement: 
// Solution 2:


}