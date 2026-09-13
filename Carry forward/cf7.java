

class Demo{
    public static void main(String[] args) {
        char arr[] = {'B', 'G', 'B', 'G', 'G'};

        int countB = 0;
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'B'){
                countB++;
            }else if(arr[i] == 'G'){
                ans = ans + countB;
            }
        }
        System.out.println(ans);
    }
}
