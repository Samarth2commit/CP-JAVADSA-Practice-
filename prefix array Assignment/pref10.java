import java.util.Scanner;

class Demo{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

        int arr[]={1, 2, 3, 4, 5};

        int prefarr[] = new int[arr.length];
        int maxsum=0;
        System.out.println("Enter the number of querries");
        int q = sc.nextInt();



        prefarr[0]=arr[0];


        for(int i=1;i<prefarr.length;i++){
            prefarr[i] = prefarr[i-1]+arr[i];
        }
       for(int query=0;query < q;query++){
        int sum =0 ;
        System.out.println("Enter start");
        int L = sc.nextInt();
        System.out.println("Enter end");
        int R = sc.nextInt();

        if(L>0 && R<prefarr.length){
            sum = (prefarr[R]-prefarr[L-1]);
        }else if(L==0  && R<prefarr.length){
            sum = (prefarr[R]);
        }else if(L<0 || R>arr.length){
            System.out.println("Enter proper limits");
        }

        if(sum>maxsum){
            maxsum=sum;
        }
    
    }
    System.out.println("maximum sum is:"+maxsum);
}    
}
