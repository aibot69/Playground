import java.util.Scanner;
class Main{
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int a=0;a<n;a++){
    	arr[a]=sc.nextInt();
    }
    int greatest=arr[0];
    for(int i=1;i<n;i++){
    	for(int j=1;j<n;j++){
        	if(greatest<arr[j]){
            	greatest=arr[j];
            }
        }
    }
    for(int x=0;x<n;x++){
    	if(greatest==arr[x])
          System.out.print(x);
    }
  }
}