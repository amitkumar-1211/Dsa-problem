public class Arraysendwithzero{
  public static void print(int[] nums) {
      for(int ele:nums){
        System.out.print(ele+" ");
      }
      System.out.println();
  }
  public static void main(String[] args) {
      int [] nums = {5,18,0,3,0,2,0};
      int n = nums.length;
        int j = 0;
        for(int i = 0; i < n; i++) {
          if(nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
         }
        }
       print(nums);
    }
  }