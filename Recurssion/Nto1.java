import java.util.Scanner;
class Demo{
       static void wholeno(int n){
    
        if(n==0)return;
        System.out.println(n);
        
        wholeno(n-1);
        
        
        
    }
    public static void main(String[] args) {
      

 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        wholeno(n);
       
    }
}
  