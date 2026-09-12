 import java.util.Scanner;
 class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[]={4, -2, 3, -1, 5};
        int prefarr[] = new int[arr.length];
        int L=sc.nextInt();
        int R=sc.nextInt();
        prefarr[0]=arr[0];
        for(int i=1;i<prefarr.length;i++){
            prefarr[i]=prefarr[i-1]+arr[i];
        }
        if(L>0 && R<prefarr.length){
            System.out.println(prefarr[R]-prefarr[L-1]);
        }else if(L==0 && R<prefarr.length){
            System.out.println(prefarr[R]);
        }else if(L<0 || R>arr.length){
            System.out.println("Enter proper limits");
        }
    }
}
