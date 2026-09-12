class cf2 {

    public static void main(String[] args) {
        int arr[]={0,1,0,1,1};
        int countZero = 0;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            if(arr[i]==1){
                sum=sum + countZero;
            }
        }
        System.out.println("pair of (0,1) is :"+sum);
    }

}
