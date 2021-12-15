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
// Solution 1 = Go throught string one at a time and when you see the # delete the last character. Then compare last strings. Use a array or stack.
// Solution 2 =


/// Implement:
// Solution 1:
class TypedOutString {
  public boolean typingStringsSol1(String str1, String str2) {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    
    for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) != '#')
          stack1.push(str1.charAt(i));
        else if (str1.charAt(i) == '#' && !stack1.isEmpty())
          stack1.pop();
    }

    for (int i = 0; i < str2.length(); i++) {
        if (str2.charAt(i) != '#')
          stack2.push(str2.charAt(i));
        else if (str2.charAt(i) == '#' && !stack2.isEmpty())
          stack2.pop();
    }

    System.out.println(stack1);
    System.out.println(stack2);

    return stack1.equals(stack2); 
  }

/// Review - Solution 1:
// *Check for mistakes
// *Walkthough code

/// Evaluate - Solution 1:
// *Check if input scales up
// Time Complexity = O(n^2) 
// Space Complexity = O(1)

/// Implement: 
// Solution 2:


}