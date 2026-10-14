public class InsertionSort{
  public static void main(String[] args) {
      int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
      for(int i = 1; i<arr.length; i++){
        int j=1;
        while(j>0 && arr[j]<arr[j-1]){
          int temp =arr[j];
          arr[j] =arr[j-1];
          arr[j-1]= temp;
        }
      }
      for(int ele: arr){
        System.out.print(ele+" ");
      }
  }
}