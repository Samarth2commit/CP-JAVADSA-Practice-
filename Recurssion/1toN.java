import java.util.Scanner;
class Demo{
    static void wholeno(int n){
    

        
        if(n==0)return;
        
        wholeno(n-1);
        System.out.println(n);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        wholeno(n);
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);
        // }
    }
}