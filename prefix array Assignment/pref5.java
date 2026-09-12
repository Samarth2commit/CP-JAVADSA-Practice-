import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,8,7,10,3};
        int prearr[] = new int[arr.length];


        int L =sc.nextInt();
        int R = sc.nextInt();


        int count = 0;
        for(int i = 0; i<arr.length ;i++){
            if(arr[i]%2==0){
                count ++;
            }
            prearr[i] = count;
        }
        if(L>0 && R<prearr.length){
            System.out.println(prearr[R]-prearr[L-1]);
        }else if(L==0 && R<prearr.length){
            System.out.println(prearr[R]);
        }else if(L<0 || R>prearr.length){
            System.out.println("Enter proper Range");
        }

    }
}
