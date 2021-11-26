class Main {
  public static void main(String[] args) {
    int[] arr = {1,3,7,9,2};
    int target = 11;
    TwoSum pro1 = new TwoSum();
    int[] result = pro1.TwoSumProb(arr, target);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }

  }
}