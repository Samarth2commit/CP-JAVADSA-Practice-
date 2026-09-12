class Demo{
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7};

          int evenCount = 0;
          int pairSum = 0;
          for(int i=0;i<arr.length;i++){
            if(arr[i] % 2==0){
                evenCount++;
            }
            else if(arr[i] % 2 !=0){
                pairSum = pairSum + evenCount;
            }
          }  

          System.out.println("Total Possible pair in given array is: "+pairSum);
    }
}
