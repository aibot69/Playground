import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
      	arr[i]=sc.nextInt();
      }
      int j=0;
      for(int i=0;i<n;i++){
      	if(arr[i]>0){
        	System.out.print(arr[i]);
          	System.out.print(" ");
          	j++;
        }
      }
      for(int x=1;x<=(n-j);x++){
      	System.out.print(0);
        System.out.print(" ");
      }
      
    }
}