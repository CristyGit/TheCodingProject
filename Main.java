class Main {
  public static void main(String[] args) {
    // Arrays Problems
    /// Easy
    //printTwoSumProb1();
    /// Medium
    //printGreatestAreaProb2();
    /// Hard
    //waterTrappedProb3();

    // Strings Problems
    typedOutStringProb4();
    
  }

  public static void printTwoSumProb1() {
    // Test Cases = 
    /// [] target=1 --> returns null 
    /// [2] target=2 --> returns null 
    /// [1,2,3,4] target=89 --> returns null 
    /// [1,3,7,9,2] target=11 --> returns [3,4]
    /// [1,6] target=7 --> returns [0,1]

    int[] arr = {1,3,7,9,2};
    int target =11;
    TwoSum pro1 = new TwoSum();

    System.out.println("\n\n////////Two Sum - Problem 1////////");
    System.out.println("Brute Force - Solution 1");
    int[] result = pro1.TwoSumSol1(arr, target);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
    System.out.println("\nOptimized - Solution 2");
    int[] result2 = pro1.TwoSumSol2(arr, target);
    for (int i = 0; i < result2.length; i++) {
      System.out.print(result2[i] + " ");
    }
  }

  public static void printGreatestAreaProb2() {
    // Test Cases = 
    /// [7,1,2,3,9] --> returns 7*4 = 28
    /// [] --> returns 0
    /// [7] --> returns 0
    /// [6,9,3,4,5,8] --> returns 8*4 = 32

    int[] arr = {7,1,2,3,9};
    MostWaterCont prob2 = new MostWaterCont();

    System.out.println("\n\n////////Greatest Area - Problem 2////////");
    System.out.println("Brute Force - Solution 1");
    int result = prob2.findAreaInLargestContainerSol1(arr);
    System.out.print(result);

    System.out.println("\nOptimized - Solution 2");
    int result2 = prob2.findAreaInLargestContainerSol2(arr);
    System.out.print(result2);
  }

  public static void waterTrappedProb3() {
    /// Test Cases = 
    /// [0,1,0,2,1,0,3,1,0,1,2] returns 8
    /// [] returns 0
    /// [3] returns 0
    /// [3,4,3] returns 0

    int[] arr = {0,1,0,2,1,0,3,1,0,1,2};
    WaterTrapped prob3 = new WaterTrapped();

    System.out.println("\n\n////////Water Trapped - Problem 3////////");
    System.out.println("Brute Force - Solution 1");
    int result = prob3.waterTrappedSol1(arr);
    System.out.print(result);

    System.out.println("\nOptimized - Solution 2");
    int result2 = prob3.waterTrappedSol2(arr);
    System.out.print(result2);
  }

  public static void typedOutStringProb4() {
    /// Test Cases = 
    // [ab#z] and [az#z] returns true
    // [] and [] returns true
    // [c#cf] and [cf] returns true
    // [ab##] and [ac#] returns false
    // [AB#] and [a] returns false
    // [##cf] and [cf] returns true

    String str1 = "AB#";
    String str2 = "a";
    TypedOutString prob4 = new TypedOutString();

    System.out.println("\n\n////////Typed Out String - Problem 4////////");
    System.out.println("Stack - Solution 1");
    boolean result = prob4.typingStringsSol1(str1, str2);
    System.out.print(result);

    System.out.println("\nOptimized - Solution 2");
    boolean result2 = prob4.typingStringsSol2(str1, str2);
    System.out.print(result2);
  }
}