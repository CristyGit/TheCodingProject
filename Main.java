class Main {
  public static void main(String[] args) {
    printTwoSumProb1();
    printGreatestAreaProb2();
  }

  public static void printTwoSumProb1() {
    // Test Cases = 
    /// [] target=1 --> returns null 
    /// [2] target=2 --> returns null 
    /// [1,2,3,4] target=89 --> returns null 
    /// [1,3,7,9,2] target=11 --> returns [3,4]
    // [1,6] target=7 --> returns [0,1]

    int[] arr = {1,3,7,9,2};
    int target =11;
    TwoSum pro1 = new TwoSum();

    System.out.println("\n\n////////Two Sum////////");
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

    int[] arr = {7};
    MostWaterCont prob2 = new MostWaterCont();

    System.out.println("\n\n////////Greatest Area////////");
    System.out.println("Brute Force - Solution 1");
    int result = prob2.findAreaInLargestContainerSol1(arr);
    System.out.print(result);

    System.out.println("\nOptimized - Solution 2");
    int result2 = prob2.findAreaInLargestContainerSol2(arr);
    System.out.print(result2);
  }
}