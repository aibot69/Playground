import java.util.Scanner;
class Main{
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int a=0;a<n;a++){
    	arr[a]=sc.nextInt();
    }
    int sum=0, suma=0;
    for(int i=0;i<3;i++){
    	sum+=arr[i];
    }
    for(int i=3;i<6;i++){
    	suma+=arr[i];
    }
    if(sum==suma){
    	System.out.print("Perfect Batch");
    } else {
    	System.out.print("Not a Perfect Batch");
    }
    
  }
}