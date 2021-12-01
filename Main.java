class Main {
  public static void main(String[] args) {
    // Test Cases = 
    /// [] target=1 --> returns null 
    /// [2] target=2 --> returns null 
    /// [1,2,3,4] target=89 --> returns null 
    /// [1,3,7,9,2] target=11 --> returns [3,4]
    // [1,6] target=7 --> returns [0,1]
    int[] arr = {1,3,7,9,2};
    int target =11;
    TwoSum pro1 = new TwoSum();
    int[] result = pro1.TwoSumSol1(arr, target);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }

    System.out.println();

    int[] result2 = pro1.TwoSumSol2(arr, target);
    for (int i = 0; i < result2.length; i++) {
      System.out.println(result2[i]);
    }
  }
}